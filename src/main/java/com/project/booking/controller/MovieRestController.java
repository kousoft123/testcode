package com.project.booking.controller;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.booking.model.Movie;
import com.project.booking.service.MovieService;
import com.project.booking.service.impl.MovieServiceImpl;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin("*")
public class MovieRestController {
	
	@Autowired
	private MovieServiceImpl movieservice;
    
    // CREATE NEW MOVIE
   @PostMapping("/newMovie")
   public Map<String, Object> create(@RequestBody Movie movie) {
	  // movie.setCreatedAt(new Date());
	   movie = movieservice.saveOrUpdate(movie);
	   Map<String, Object> dataMap = new HashMap<String, Object>();
	   dataMap.put("message", "Movie created successfully");
	   dataMap.put("status", "OK");
	   dataMap.put("Name", movie);
	      return dataMap;
	  }



    // GET /{movieId} : get one movie by id
    @RequestMapping(method = RequestMethod.GET, value="/{movieId}")
    public Movie getMovieDetails(@PathVariable("movieId") String movieId){
//        return bookRepository.findOne(bookId).map(m -> ResponseEntity.ok().body(m)).orElse(ResponseEntity.notFound().build());
        return null;

    }



//
//
//
//        @RequestMapping(method = RequestMethod.POST)
//        public Map<String, Object> createBook(@RequestBody Map<String, Object> bookMap){
//            Book book = new Book(bookMap.get("name").toString(),
//                    bookMap.get("isbn").toString(),
//                    bookMap.get("author").toString(),
//                    Integer.parseInt(bookMap.get("pages").toString()));
//
//            bookRepository.save(book);
//            Map<String, Object> response = new LinkedHashMap<String, Object>();
//            response.put("message", "Book created successfully");
//            response.put("book", book);
//            return response;
//        }
//
//        @RequestMapping(method = RequestMethod.GET, value="/{bookId}")
//        public Book getBookDetails(@PathVariable("bookId") String bookId){
//            return bookRepository.findOne(bookId);
//        }
//    }
//
//    @RequestMapping(method = RequestMethod.PUT, value="/{bookId}")
//    public Map<String, Object> editBook(@PathVariable("bookId") String bookId,
//                                        @Valid @RequestBody Map<String, Object> bookMap){
//        Book book = new Book(bookMap.get("name").toString(),
//                bookMap.get("isbn").toString(),
//                bookMap.get("author").toString(),
//                Integer.parseInt(bookMap.get("pages").toString()));
//        book.setId(bookId);
//
//        Map<String, Object> response = new LinkedHashMap<String, Object>();
//        response.put("message", "Book Updated successfully");
//        response.put("book", bookRepository.save(book));
//        return response;
//    }
//
//    // DELETE existing movie
//    @RequestMapping(method = RequestMethod.DELETE, value="/{bookId}")
//    public Map<String, String> deleteBook(final @PathVariable("bookId") String bookId){
//        bookRepository.delete(bookId);
//        Map<String, String> response = new HashMap<String, String>();
//        response.put("message", "Book deleted successfully");
//
//        return response;
//    }
//
//    // GET ALL MOVIES TO DISPLAY
//    @GetMapping
//    public Map<String, Object> getAllBooks(){
//
//        // sort :
//        Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
//
//        List<Book> books = bookRepository.findAll(sortByCreatedAtDesc);
//        Map<String, Object> response = new LinkedHashMap<String, Object>();
//        response.put("totalBooks", books.size());
//        response.put("books", books);
//        return response;
//    }
}


//
//@PutMapping(value="/todos/{id}")
//public ResponseEntity<Todo> updateTodo(@PathVariable("id") String id,
//@Valid @RequestBody Todo todo) {
//        return todoRepository.findById(id)
//        .map(todoData -> {
//        todoData.setTitle(todo.getTitle());
//        todoData.setCompleted(todo.getCompleted());
//        Todo updatedTodo = todoRepository.save(todoData);
//        return ResponseEntity.ok().body(updatedTodo);
//        }).orElse(ResponseEntity.notFound().build());
//        }
//
//@DeleteMapping(value="/todos/{id}")
//public ResponseEntity<?> deleteTodo(@PathVariable("id") String id) {
//        return todoRepository.findById(id)
//        .map(todo -> {
//        todoRepository.deleteById(id);
//        return ResponseEntity.ok().build();
//        }).orElse(ResponseEntity.notFound().build());
//        }