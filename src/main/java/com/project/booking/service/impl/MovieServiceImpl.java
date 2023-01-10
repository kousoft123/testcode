package com.project.booking.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.booking.model.Movie;
import com.project.booking.repository.MovieRepository;
import com.project.booking.service.MovieService;

import java.util.ArrayList;
import java.util.List;



@Service
@Transactional
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movieRepo;

	@Override
	public List<Movie> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie saveOrUpdate(Movie movie) {
		System.out.println("movie"+movie.toString());
		return movieRepo.save(movie);
	}

	@Override
	public Movie getByName(String name) {
		
		return (Movie) movieRepo.findByName(name);
	}

}