# Spring Boot Application for Kafka

This application tells how to setup Apache Kafka and create an application for Apache Kafka Producer and Listner.

## Start Kafka 
1.	Download Kafka from Apacke Kafka Website
2.	Unzip the Kafka
3.	Go to the Kafka Directory
4.	To Start the Apache Zookeeper -  
    
        .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties 
    
    ![Zookeeper](img\zookeeper.properties.png)
5.	Start Apache Kafka  (open it in another terminal)

        .\bin\windows\kafka-server-start.bat .\config\server.properties 

    ![Zookeeper](img\kafka-server.png) 
6.	Start Consumer Listening  

        .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic worldlink-service --from-beginning  
    
    ![Zookeeper](img\kafka-listner.png)

## Run Application

1. Run the main java class - **com.listner.kafka.KafkaApplication**
2. Hit the endpoint in browser

        http://localhost:8002/kafka/publish/test
3. Output can be see in Listner we have started before
    ![Zookeeper](img\listnner-response.png)