package com.project.booking.model;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "address")
@Data
public class Address {

        private String streetNum;

        private String locality;

        private String state;

        private String country;
        private String city;

        private int pincode;
}