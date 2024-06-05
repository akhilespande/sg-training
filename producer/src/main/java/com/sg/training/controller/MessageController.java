package com.sg.training.controller;

import com.sg.training.service.MessageProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/message")
public class MessageController {

    @Autowired
    private MessageProducerService messageProducerService;

    @PostMapping("publish")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        messageProducerService.sendMessage(message);
        return new ResponseEntity<>("Message produced...", HttpStatus.OK);
    }
}
