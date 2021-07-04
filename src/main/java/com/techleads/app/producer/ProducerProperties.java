package com.techleads.app.producer;

public interface ProducerProperties {

    String applicationID = "HelloProducer";
    String bootstrapServers = "localhost:9092,localhost:9093";
    String topicName = "hello-producer-topic";
    int numEvents = 1000000;
}
