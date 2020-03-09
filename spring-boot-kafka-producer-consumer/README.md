# Spring Boot Application for Kafka

This application tells how to setup Apache Kafka and create an application for Apache Kafka Producer and Listner.

## Start Kafka 
1.	Download Kafka from Apacke Kafka Website
2.	Unzip the Kafka
	
		tar -xzf kafka_2.12-2.4.0.tgz
		 
3.	Go to the Kafka Directory

		cd kafka_2.12-2.4.0
		
4.	To Start the Apache Zookeeper -  
    
		.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties 
		
	for linux
		
		bin/zookeeper-server-start.sh config/zookeeper.properties
    
    ![Zookeeper](https://github.com/aman7797/spring-boot-kafka/blob/master/spring-boot-kafka-producer-consumer/img/zookeeper.properties.png)
5.	Start Apache Kafka  (open it in another terminal)

		.\bin\windows\kafka-server-start.bat .\config\server.properties 
	
	for linux
		
		bin/kafka-server-start.sh config/server.properties

    ![Zookeeper](https://github.com/aman7797/spring-boot-kafka/blob/master/spring-boot-kafka-producer-consumer/img/kafka-server.png) 
6.	Start Consumer Listening  

		.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic worldlink-service --from-beginning 
	for linux
	
		bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic worldlink-service
    
    ![Zookeeper](https://github.com/aman7797/spring-boot-kafka/blob/master/spring-boot-kafka-producer-consumer/img/kafka-listner.png)

=> To Check the running topics
	
	bin/kafka-topics.sh --list --bootstrap-server localhost:9092
	
## Run Application

1. Run the main java class - **com.listner.kafka.KafkaApplication**
2. Endpoint to test **Producer**

    	http://localhost:8002/kafka/publish/test

    Output can be see in Listner we have started before

    ![Zookeeper](https://github.com/aman7797/spring-boot-kafka/blob/master/img/listnner-response.png)

3. Endpoint to test **Consumer**

	http://localhost:8002/kafka/consume/test

    ![Zookeeper](https://github.com/aman7797/spring-boot-kafka/blob/master/img/consumer-output.png)
    
