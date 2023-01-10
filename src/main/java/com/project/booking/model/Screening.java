package com.project.booking.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Document(collection = "screening")
@Data
public class Screening implements Serializable {
	
	private long id;
	private String screenName;
	private long movieId;
	@CreatedDate
	private LocalDate date;
	private String startTime;
	private String endTime;
	private Boolean housefull;
	 @JsonIgnore
	private Set<Movie> movieList;
	
	
}
