package com.gaurav.rabbit_mq_consumer.listner;

import com.gaurav.rabbit_mq_consumer.configuration.RabbitConfiguration;
import com.gaurav.rabbit_mq_consumer.model.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    //middleware is our Rabbitmq application
    @RabbitListener(queues = RabbitConfiguration.QUEUE_NAME)
    public void listener(CustomMessage customMessage) {
        System.out.println(customMessage);
    }
}
