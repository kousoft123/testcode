package com.project.booking.service.impl;

import java.net.http.HttpHeaders;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.project.booking.dto.order.PaymentForBooking;
import com.project.booking.model.Booking;
import com.project.booking.model.Movie;
import com.project.booking.model.Screening;
import com.project.booking.repository.BookingRepo;
import com.project.booking.repository.MovieRepository;
import com.project.booking.repository.ScreeningRepo;
import com.project.booking.repository.SeatBookingRepo;
import com.project.booking.service.MovieService;

@Service
public class BookingServiceImpl {
	
	@Autowired
	private BookingRepo bookingRepo;
	
	@Autowired
	private MovieRepository movierepo;
	
	@Autowired
	private ScreeningRepo screenrepoRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Booking createBooking(Booking booking) {
		new Booking();
		//double id=Math.random();
		System.out.println("-----"+booking.toString());
		Screening scr = screenrepoRepo.findById(booking.getScreening().getId()).orElse(new Screening());
		scr.setDate(LocalDate.now());
		booking.setScreening(scr);
		booking.setBookingTime(LocalTime.now());
		Movie mov = movierepo.findById(booking.getMovie().getId());
		mov.setCreatedAt(LocalDate.of(1998, Month.AUGUST, 13));
		booking.setMovie(mov);
		System.out.println("-----"+booking.toString());
		
		PaymentForBooking pbook = new PaymentForBooking();
		pbook.setAmount(mov.getPrice());
		pbook.setInvoiceDate(LocalDateTime.now());
		pbook.setAuditoriumId(booking.getScreening().getScreenName());
		
		
		ResponseEntity<PaymentForBooking> payment=payment( pbook, booking.getUser().getId());
		
		if(payment.getStatusCode()==HttpStatus.OK) {
			booking.setPaymentStatus(true);
			return bookingRepo.save(booking);
		}else {
			return new Booking();
		}
		
		
	}
	
	public ResponseEntity<PaymentForBooking> payment(PaymentForBooking payment,String userId) {
		HttpHeaders headers = new HttpHeaders(null);
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<PaymentForBooking> entity = new HttpEntity<PaymentForBooking>(payment,headers);		 
		
		 ResponseEntity<PaymentForBooking> response = restTemplate.exchange(
		            "http://localhost:8082/api/payment/create", HttpMethod.POST, entity, Employee.class);
		
		 //ResponseEntity<PaymentForBooking> result = restTemplate.postForEntity("http://localhost:8082/api/payment/create", payment, PaymentForBooking.class);
		 
		 return result;
	}
	
	

}
