package com.example.ToodleJira.Repository;

import com.example.ToodleJira.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, String> {
}
