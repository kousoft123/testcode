package com.project.booking.model.order;
import java.util.List;


import org.springframework.data.annotation.Id;

import com.project.booking.model.Customer;
import com.project.booking.model.Movie;



public class Order {
    @Id
    private String id;

    private Customer customer;

    private List<Movie> movies;


}