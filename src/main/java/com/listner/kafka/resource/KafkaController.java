package com.listner.kafka.resource;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.listner.kafka.model.SendMessageInfo;

@RestController
@RequestMapping("kafka")
public class KafkaController {

	@Autowired
	private KafkaTemplate<String, SendMessageInfo> kafkaTemplate;

	private static final String SERVICE = "worldlink-service";

	private org.slf4j.Logger Logger = LoggerFactory.getLogger(KafkaController.class);

	/**
	 * @param sendMessageInfo
	 * @return
	 */
	@PostMapping("/publish/sendmessageinfo")
	public String producer(@RequestBody SendMessageInfo sendMessageInfo) {
		Logger.info("Kafka Producer called :: ");
		kafkaTemplate.send(SERVICE, sendMessageInfo);

		return "Test Succesfull";

	}

	@GetMapping("/publish/test")
	public String test() {

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8002/kafka/publish/sendmessageinfo";
		SendMessageInfo request = new SendMessageInfo("123", "456", "Inquiry", "Validation");
		ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
		return response.getBody();

	}

}
