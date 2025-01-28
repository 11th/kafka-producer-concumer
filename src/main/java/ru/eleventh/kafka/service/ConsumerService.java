package ru.eleventh.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "simple-topic", groupId = "1")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group 1: " + message);
    }
}
