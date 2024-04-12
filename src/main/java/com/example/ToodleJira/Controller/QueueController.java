package com.example.ToodleJira.Controller;

import com.example.ToodleJira.Service.Impl.MessageSenderServiceImpl;
import com.example.ToodleJira.Service.MessageSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class QueueController {

    @Autowired
    MessageSenderService messageSenderService;

    @GetMapping("/send")
    public String sendMessage(@RequestBody String message){
        messageSenderService.send(message);
        return "Success sending : "+message;
    }

    //    @GetMapping("/receive")
//    public String receiveMessage() {
//        String message = receiverService.receiveMessage();
//        return message != null ? "Received message: " + message : "No message received.";
//    }
}
