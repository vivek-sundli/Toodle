package com.example.ToodleJira.Service;

import org.springframework.stereotype.Service;

@Service
public interface ReceiverService {
    public void receiveMessage(String message);
}
