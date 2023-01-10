package com.project.booking.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.booking.model.user.User;

//@RepositoryRestResource
public interface UserRepository extends MongoRepository<User,Integer> {
    // Find user by first name
    User findByFirstName(String firstname);

    @Query("{'username': { '$regex' : ?0 } }")
    List<User> findAllByUserName(String username);


}