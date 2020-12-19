package com.cybertek.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    private Long ticketId;

    private Long movieCinemaId;

    private Long userAccountId;

    private LocalDateTime dateTime;

    private Long seatNumber;

    private Long rowNumber;





}
