package com.project.booking.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;


import com.project.booking.model.Category;


public interface CategoryRepository extends MongoRepository<Category, String> {
    // find all

    public Page<Category> findAll(Pageable pageable);

    // find by name
    public Category findByName(String name);
}