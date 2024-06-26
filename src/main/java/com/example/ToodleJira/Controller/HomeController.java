package com.example.ToodleJira.Controller;

import com.example.ToodleJira.Dto.TicketDto;
import com.example.ToodleJira.Entity.Ticket;
import com.example.ToodleJira.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    TicketService ticketService;

    @GetMapping
    public String getCall(){
        return "Application running";
    }

    @PostMapping("/save/ticket")
    public String saveTicket(@RequestBody TicketDto ticketDto){
        ticketService.saveticket(ticketDto);
        return "Success";
    }
    @PostMapping("/save/ticket/mongo")
    public String saveTicketMongo(@RequestBody TicketDto ticketDto){
        ticketService.saveTicketMongo(ticketDto);
        return "Success for Mongo!";
    }

    @GetMapping("/get/ticket/all")
    public List<Ticket> getTickets(){
        return ticketService.getAllTickets();
    }

    @GetMapping("/get/ticket/all/mongo")
    public List<Ticket> getTicketsMongo(){
        return ticketService.getAllTicketsMongo();
    }
}
