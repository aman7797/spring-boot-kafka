package com.listner.kafka.resource;

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

	/*
	 * @GetMapping("/publish/{message}") public String post(@PathVariable("message")
	 * final String message) {
	 * 
	 * kafkaTemplate.send(SERVICE, message); return "Test Succesfull"; }
	 */

	/**
	 * @param sendMessageInfo
	 * @return
	 */
	@PostMapping("/publish/sendmessageinfo")
	public String post(@RequestBody SendMessageInfo sendMessageInfo) {

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
