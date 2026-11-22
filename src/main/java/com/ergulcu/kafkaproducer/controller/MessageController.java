package com.ergulcu.kafkaproducer.controller;

import com.ergulcu.kafkaproducer.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;
    @PostMapping("/message")
    public void postMessage(@RequestBody String message){
        messageService.sendMessage(message);
    }
}
