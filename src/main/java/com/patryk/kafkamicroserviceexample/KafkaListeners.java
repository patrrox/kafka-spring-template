package com.patryk.kafkamicroserviceexample;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "patryk",
            groupId = "groupId")
    void listener(String message) {
        System.out.println("Listener received: " + message + " :)");
    }
}
