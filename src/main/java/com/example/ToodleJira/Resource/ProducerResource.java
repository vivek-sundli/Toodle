package com.example.ToodleJira.Resource;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publisher")
public class ProducerResource {
    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    ActiveMQQueue activeMQQueue;

    @GetMapping("/{message}")
    public String publish(@PathVariable("message") final String message){
        jmsTemplate.convertAndSend(activeMQQueue,message);
        return "Published Successfully!";
    }
}
