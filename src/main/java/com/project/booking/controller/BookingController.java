package com.project.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.booking.model.Booking;
import com.project.booking.service.impl.BookingServiceImpl;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
	
	@Autowired
	private BookingServiceImpl bookingService;
	
	@PostMapping("/createTicket")
	public Booking createTicket(@RequestBody Booking booking) {
		return bookingService.createBooking(booking);
		
	}

}
