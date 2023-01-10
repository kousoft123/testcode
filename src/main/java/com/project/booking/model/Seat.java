package com.project.booking.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;



@Document(collection = "seat")
@Data
public class Seat {
	
	@Id
	private Long id;
	private int auditoriumId;
	private SeatBooked bookedSeats;

}
