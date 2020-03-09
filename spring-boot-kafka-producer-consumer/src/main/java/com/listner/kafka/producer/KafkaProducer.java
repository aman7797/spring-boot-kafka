// package com.listner.kafka.producer;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.kafka.core.KafkaTemplate;
//
// import com.listner.kafka.model.SendMessageInfo;
//
// public class KafkaProducer {
//
// @Autowired
// private KafkaTemplate<String, SendMessageInfo> kafkaTemplate;
//
// private static final String SERVICE = "worldlink-service";
//
// public String invoker(SendMessageInfo sendMessageInfo) {
//
// kafkaTemplate.send(SERVICE, sendMessageInfo);
//
// return "Test Succesfull";
//
// }
// }
