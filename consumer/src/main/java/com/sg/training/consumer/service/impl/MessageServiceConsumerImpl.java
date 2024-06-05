package com.sg.training.consumer.service.impl;

import com.sg.training.consumer.service.MessageServiceConsumer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MessageServiceConsumerImpl implements MessageServiceConsumer {

    private static final Logger log = LoggerFactory.getLogger(MessageServiceConsumerImpl.class);

    @KafkaListener(topics = "live-chat-room", groupId = "message_consumer-group")
    @Override
    public void consume(String message) {
        log.info("Message Consumed...[{}]", message);
    }
}
