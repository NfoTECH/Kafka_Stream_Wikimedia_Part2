package com.fortunate.reactiveproducer.producer;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WikimediaProducer {

    private static final Logger LOG = LoggerFactory.getLogger(WikimediaProducer.class);

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        LOG.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send("wikimedia-stream", message);
    }
}
