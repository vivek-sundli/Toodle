package com.example.ToodleJira.Configuration;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Jmsconfig {
    public ActiveMQQueue queue(){
        return new ActiveMQQueue("sample.queue");
    }
}
