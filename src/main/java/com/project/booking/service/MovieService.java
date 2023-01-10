package com.project.booking.service;
import java.util.List;

import com.project.booking.model.Movie;


public interface MovieService {

   List<Movie> listAll();

   Movie getById(String id);
   Movie getByName(String name);

    Movie saveOrUpdate(Movie movie);
//
//    void delete(String id);
//
//    Movie saveOrUpdateProductForm(ProductForm productForm);


}