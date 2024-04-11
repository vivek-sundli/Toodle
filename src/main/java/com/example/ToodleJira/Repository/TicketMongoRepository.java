package com.example.ToodleJira.Repository;

import com.example.ToodleJira.Entity.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketMongoRepository extends MongoRepository<Ticket,String> {
}
