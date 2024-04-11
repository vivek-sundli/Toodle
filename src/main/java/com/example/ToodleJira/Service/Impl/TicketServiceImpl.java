package com.example.ToodleJira.Service.Impl;

import com.example.ToodleJira.Dto.TicketDto;
import com.example.ToodleJira.Entity.Ticket;
import com.example.ToodleJira.Repository.TicketRepository;
import com.example.ToodleJira.Repository.TicketMongoRepository;
import com.example.ToodleJira.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    TicketMongoRepository ticketMongoRepository;

    @Override
    public void saveticket(TicketDto ticketDto) {
        Ticket ticket = new Ticket();
        ticket.setId(ticketDto.getId());
        ticket.setPriority(ticketDto.getPriority());
        ticket.setProject(ticketDto.getProject());
        ticket.setDescription(ticketDto.getDescription());
        ticketRepository.save(ticket);
    }

    @Override
    public void saveTicketMongo(TicketDto ticketDto) {
        Ticket ticket = new Ticket();
        ticket.setId(ticketDto.getId());
        ticket.setDescription(ticketDto.getDescription());
        ticket.setPriority(ticketDto.getPriority());
        ticket.setProject(ticketDto.getProject());
        ticketMongoRepository.save(ticket);
    }

    @Override
    public Optional<Ticket> getTicketById(String Id) {
        Optional<Ticket> ticket = ticketRepository.findById(Id);
        return ticket;
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll().stream().toList();
    }

    @Override
    public List<Ticket> getAllTicketsMongo() {
        return ticketMongoRepository.findAll().stream().toList();
    }
}
