package com.udemy.rabbitmq.producer;

import com.udemy.rabbitmq.json.Student;

public interface IProducer {

    void producerMessage(String message);
    void producerStudent(Student student);


}
