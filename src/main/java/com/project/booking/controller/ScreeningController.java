package com.project.booking.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.booking.model.BookingTimeDate;
import com.project.booking.model.Screening;
import com.project.booking.repository.ScreeningRepo;
import com.project.booking.service.impl.ScreenServiceImpl;

@RestController
@RequestMapping("/api/")
public class ScreeningController {
	
	@Autowired
	private ScreenServiceImpl screenServ;
	@PostMapping("/screen")
	public Screening createScreen(@RequestBody Screening scr) {
		
		return screenServ.createScreen(scr);
	}

}
