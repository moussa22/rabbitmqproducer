package com.udemy.rabbitmq.impl;

import com.udemy.rabbitmq.json.Student;
import com.udemy.rabbitmq.producer.IProducer;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class producer implements IProducer {
    @Autowired
    private AmqpTemplate amqpTemplate;
    @Value(("${udemy.rabbitmq.exchange}"))
    private String exchange ;
    @Value(("${udemy.rabbitmq.routingkey}"))
    private String routingkey;
    @Override
    public void producerMessage(String message) {

        amqpTemplate.convertAndSend(exchange,routingkey,message);

        System.out.println("Send message ="+message);

    }

    @Override
    public void producerStudent(Student student) {

        amqpTemplate.convertAndSend(exchange,routingkey,student);

        System.out.println("Send message ="+student);

    }
}



