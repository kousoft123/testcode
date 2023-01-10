package com.project.booking.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Document(collection = "seatbooked")
@Data
public class SeatBooked {

    @Id
    private Long id;

    private String seatNo;
    

    
    
}