package com.project.booking.repository.order;
import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.project.booking.model.Movie;
import com.project.booking.model.user.User;

public class ShoppingCart implements Serializable {

    @Id
    private String id;

    private User user;

    private Movie movie;

//    @NotNull
//    private Integer stock;

    private Double amount;

    private String status;

    private Date date;

}