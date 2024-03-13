package com.rabittMQ.RabbitMQWithSpringboot.controller;

import com.rabittMQ.RabbitMQWithSpringboot.dto.User;
import com.rabittMQ.RabbitMQWithSpringboot.publisher.RabbitMQJsonProducer;
import com.rabittMQ.RabbitMQWithSpringboot.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/V1")
public class MessageJsonController {

    private RabbitMQJsonProducer jsonProducer;

    public MessageJsonController (RabbitMQJsonProducer jsonProducer){
        this.jsonProducer = jsonProducer;
    }

    @GetMapping("/json/publish")
    public ResponseEntity<String> sendJsonMesssage(@RequestBody User user){
        jsonProducer.sendJsonMessage(user);
        return ResponseEntity.ok("Json message sent to RabbitMQ ...");

    }
}