package com.example.ToodleJira.Service;

import org.springframework.stereotype.Service;

@Service
public interface MessageSenderService {
    public void send(String message);
}
