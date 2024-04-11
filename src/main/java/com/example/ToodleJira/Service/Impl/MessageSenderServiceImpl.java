package com.example.ToodleJira.Service.Impl;

import com.example.ToodleJira.Service.MessageSenderService;
import jakarta.jms.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;

import java.util.Queue;

public class MessageSenderServiceImpl implements MessageSenderService {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    @Override
    public void send(String message) {
        jmsTemplate.convertAndSend((Destination) queue,message);
    }
}
