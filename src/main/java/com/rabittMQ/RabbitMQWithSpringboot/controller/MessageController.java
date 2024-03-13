package com.rabittMQ.RabbitMQWithSpringboot.controller;

import com.rabittMQ.RabbitMQWithSpringboot.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/V1")
public class MessageController {
    private RabbitMQProducer producer;

    public MessageController(RabbitMQProducer producer){
        this.producer = producer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> sendMesssage(@RequestParam("message") String message){
        producer.sendMesssage(message);
        return ResponseEntity.ok("Message sent to RabbitMQ ...");

    }
}

