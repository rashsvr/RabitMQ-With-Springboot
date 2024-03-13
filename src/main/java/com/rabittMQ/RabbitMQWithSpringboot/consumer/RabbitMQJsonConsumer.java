package com.rabittMQ.RabbitMQWithSpringboot.consumer;

import com.rabittMQ.RabbitMQWithSpringboot.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);
    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consume(User user){
        LOGGER.info(String.format("Received jSON message -> %s",user.toString()));
    }
}
