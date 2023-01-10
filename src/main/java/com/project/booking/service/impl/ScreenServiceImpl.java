package com.project.booking.service.impl;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.booking.model.Movie;
import com.project.booking.model.Screening;
import com.project.booking.repository.MovieRepository;
import com.project.booking.repository.ScreeningRepo;

@Service
public class ScreenServiceImpl {
	
	@Autowired
	private ScreeningRepo screeningRepo;
	
	@Autowired
	private MovieRepository movieRepo;
	
	public Screening createScreen(Screening screen) {
		
		long movieId=screen.getMovieId();
	
		//Movie mov= movieRepo.findById(movieId);
		screen.setDate(LocalDate.now());
		
		System.out.println("screen=="+ screen);
		return screeningRepo.save(screen);
		//return null;
	}

}
