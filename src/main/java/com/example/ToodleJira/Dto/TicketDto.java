package com.example.ToodleJira.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TicketDto {

    private String id;
    private String Project;
    private String Description;
    private String Priority;
}
