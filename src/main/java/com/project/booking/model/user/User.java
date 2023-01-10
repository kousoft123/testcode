package com.project.booking.model.user;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.booking.model.Address;
import com.project.booking.repository.order.ShoppingCart;

import org.springframework.data.annotation.Id;


import org.springframework.data.mongodb.core.index.Indexed;
import java.io.Serializable;
import java.util.*;


@Document(collection = "user")
@Data
public class User implements Serializable {
    @Id
    private String id;

   
    private String firstName;

    
    private String lastname;
    @JsonIgnore
    @Indexed(unique = true)
    private String email;
    @JsonIgnore
    private String password;
    @JsonIgnore
    private int age;
    @JsonIgnore
    private Address address;
   
    // db ref :
    //@DBRef
    //private Set<ShoppingCart> shoppingCarts = new HashSet<>();



}