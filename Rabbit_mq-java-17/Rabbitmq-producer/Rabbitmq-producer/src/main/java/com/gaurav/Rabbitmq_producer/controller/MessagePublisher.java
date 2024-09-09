package com.gaurav.Rabbitmq_producer.controller;

import com.gaurav.Rabbitmq_producer.configuration.RabbitConfiguration;
import com.gaurav.Rabbitmq_producer.model.CustomMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
public class MessagePublisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/publish")
    public String PublishMessage(@RequestBody CustomMessage message){
        message.setMessageId(UUID.randomUUID().toString());
        message.setMessageDate(new Date());
        System.out.println(message);
        template.convertAndSend(RabbitConfiguration.EXCHANGE_NAME, RabbitConfiguration.ROUTING_KEY, message);
        return "Message Published";

    }
}
