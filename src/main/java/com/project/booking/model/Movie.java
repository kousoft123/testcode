package com.project.booking.model;
import java.io.Serializable;
import java.time.LocalDate;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Document(collection = "movie")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
@Data
public class Movie implements Serializable {
    @Id
    private long id;

   //@Indexed(name = "name",unique = true)// add index when search with movie name
    private String name;

    @Field("description")
    private String description;

    private double price; 
    @Field("published")
    private LocalDate publicationDate;
    
    @CreatedDate
     private LocalDate createdAt;


    // db ref
    @DBRef
    @JsonIgnore
    private Category category;

  
    
    


}