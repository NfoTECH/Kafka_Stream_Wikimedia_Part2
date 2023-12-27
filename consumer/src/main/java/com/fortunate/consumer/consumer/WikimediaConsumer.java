package com.fortunate.consumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WikimediaConsumer {
    private static final Logger LOG = LoggerFactory.getLogger(WikimediaConsumer.class);

    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consumeMessage(String message) {
        LOG.info(String.format("#### -> Consumed message -> %s", message));

        //Todo: Save the data to MongoDB
    }
}