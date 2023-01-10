package com.project.booking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.booking.model.Booking;

public interface BookingRepo extends MongoRepository<Booking, Long> {

}
