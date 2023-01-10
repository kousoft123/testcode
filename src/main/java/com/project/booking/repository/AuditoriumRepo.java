package com.project.booking.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.booking.model.Address;
import com.project.booking.model.Auditorium;

public interface AuditoriumRepo extends MongoRepository<Auditorium, Long> {
	
	//List<AuditoriumRepo> findByCity(Address addr);

}
