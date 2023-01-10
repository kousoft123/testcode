package com.project.booking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.booking.model.Screening;

@Repository
public interface ScreeningRepo extends MongoRepository<Screening, Long> {

}
