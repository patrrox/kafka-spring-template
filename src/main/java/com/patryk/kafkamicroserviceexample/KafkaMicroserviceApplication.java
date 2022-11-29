package com.patryk.kafkamicroserviceexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.LocalDateTime;

@SpringBootApplication
public class KafkaMicroserviceApplication {

    public static void main(String[] args) {

        SpringApplication.run(KafkaMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, Message> kafkaTemplate) {
        return args -> {
            for (int i = 0; i < 10; i++)
                kafkaTemplate.send(
                        "patryk",
                        new Message(
                                "hello kafka :) " + i,
                                LocalDateTime.now()));
        };
    }

}
