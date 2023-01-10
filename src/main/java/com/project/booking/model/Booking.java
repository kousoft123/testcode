package com.project.booking.model;

import java.time.LocalTime;
import java.util.Set;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.project.booking.model.user.User;

import lombok.Data;

@Document(collection = "booking")
@Data
public class Booking {

	@Id
	private long id;
	private Screening screening;
	private User user;
	@CreatedDate
	private LocalTime bookingTime;
	private boolean booked;
	private boolean active;
	private SeatBooked bookedSeats;
	private Movie movie;
	private boolean paymentStatus;

}
