package com.example.ToodleJira.Service;

import com.example.ToodleJira.Dto.TicketDto;
import com.example.ToodleJira.Entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TicketService {
    public void saveticket(TicketDto ticketDto);
    public void saveTicketMongo(TicketDto ticketDto);
    public Optional<Ticket> getTicketById(String Id);
    public List<Ticket> getAllTickets();
    public List<Ticket> getAllTicketsMongo();
}
