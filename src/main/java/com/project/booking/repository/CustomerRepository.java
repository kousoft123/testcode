package com.project.booking.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.booking.model.Customer;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "customer",path = "customer")
public interface CustomerRepository extends MongoRepository<Customer,String>{
    // search for customer by customer email
   // List<Customer> findByEmail(@Param("email") String email);


   // Customer save(Customer customer) ;

    //List<Customer> findByName(String fName) ;

//    Customer findById(String id) ;

   // void deleteCustomerById(String id);
}