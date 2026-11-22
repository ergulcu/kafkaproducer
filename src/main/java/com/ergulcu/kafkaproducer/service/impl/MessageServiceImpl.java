package com.ergulcu.kafkaproducer.service.impl;

import com.ergulcu.kafkaproducer.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final KafkaTemplate<String, String> kafkaTemplate;
    @Override
    public void sendMessage(String message){
        kafkaTemplate.send("TestTopic", message);
    }

}
