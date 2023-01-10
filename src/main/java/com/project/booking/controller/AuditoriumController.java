package com.project.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.booking.model.Auditorium;
import com.project.booking.service.impl.AuditoriumServiceImpl;

@RestController
@RequestMapping("/api/auditorium")
public class AuditoriumController {
	
	@Autowired
	private AuditoriumServiceImpl auditoriumImpl;
	
	@PostMapping("/create")
	public Auditorium createAuditorium(@RequestBody Auditorium auditorium) {
		Auditorium auditoriumNew=auditoriumImpl.createData(auditorium);
		return auditoriumNew;
		
	}
	

}
