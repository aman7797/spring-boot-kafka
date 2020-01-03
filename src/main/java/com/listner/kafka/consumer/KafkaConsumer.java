package com.listner.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.listner.kafka.model.SendMessageInfo;

@Service
public class KafkaConsumer {

	// @KafkaListener(topics = "worldlink-service", group = "group_id")
	// public void consume(String message) {
	// System.out.println("Consumed message: " + message);
	// }
	private Logger Logger = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "worldlink-service", containerFactory = "userKafkaListenerFactory")
	public void consumeJson(SendMessageInfo sendMessageInfo) {
		Logger.info("Kafka Consumer called :: ");
		System.out.println("Consumed JSON Message: " + sendMessageInfo);
	}
}
