package com.project.booking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.booking.model.SeatBooked;

@Repository
public interface SeatBookingRepo extends MongoRepository<SeatBooked, Long> {

}
