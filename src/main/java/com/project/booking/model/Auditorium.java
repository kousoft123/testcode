package com.project.booking.model;


import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "auditorium")
@Data
public class Auditorium {
    @Id
    private Long id;
    private Integer seatCount;
    private Theatre theatre;
    private String city;
    
    private List<Seat> seats;
    private List<Address> address;
}