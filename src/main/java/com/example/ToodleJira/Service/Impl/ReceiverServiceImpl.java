package com.example.ToodleJira.Service.Impl;

import com.example.ToodleJira.Service.ReceiverService;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiverServiceImpl implements ReceiverService {
    @Override
    @JmsListener(destination = "sample.queue")
    public void receiveMessage(String message) {
        System.out.println("Message "+ message + " received successfully!");
    }

}
