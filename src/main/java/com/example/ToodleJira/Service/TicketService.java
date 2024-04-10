package com.example.ToodleJira.Service;

import com.example.ToodleJira.Dto.TicketDto;
import com.example.ToodleJira.Entity.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {
    public void saveticket(TicketDto ticketDto);
    public Optional<Ticket> getTicketById(String Id);
    public List<Ticket> getAllTickets();
}
