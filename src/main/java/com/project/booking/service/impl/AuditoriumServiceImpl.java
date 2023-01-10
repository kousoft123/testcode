package com.project.booking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.booking.model.Auditorium;
import com.project.booking.repository.AuditoriumRepo;

@Service
public class AuditoriumServiceImpl {
	
	@Autowired
	private AuditoriumRepo auditoriumRepo;
	
	public List<Auditorium> getListOfAuditorium()	{
		
		return auditoriumRepo.findAll();
				
	}
	
	public Auditorium createData(Auditorium auditorium) {
		return auditoriumRepo.save(auditorium);
	}

}
