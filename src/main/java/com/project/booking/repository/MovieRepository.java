package com.project.booking.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.booking.model.Category;
import com.project.booking.model.Movie;

import java.util.List;



@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
    // find list of movie by category
    List<Movie> findByCategory(Category category);

    // get movie by id
    Movie getMovieById(String id);

    // save new movie to database
    Movie save(Movie movie);

    // find movie by name
    Movie findByName(String name);

    // delete movie
    void deleteMovieById(String id);

	Movie findById(long id);


}