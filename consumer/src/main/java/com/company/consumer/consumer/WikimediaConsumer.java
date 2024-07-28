package com.company.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-stream-topic", groupId = "wikimedia")
    public void consume(String message) {
        log.info("Consuming the message from wikimedia-stream Topic: {}", message);
    }

}
