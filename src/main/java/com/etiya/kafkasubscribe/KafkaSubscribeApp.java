package com.etiya.kafkasubscribe;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.util.Collections;

@SpringBootApplication
public class KafkaSubscribeApp {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSubscribeApp.class, args);
    }
}