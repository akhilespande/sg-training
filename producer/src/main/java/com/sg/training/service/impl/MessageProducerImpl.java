package com.sg.training.service.impl;

import com.sg.training.service.MessageProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducerImpl implements MessageProducerService {
    private static final String TOPIC = "live-chat-room";

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public MessageProducerImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}
