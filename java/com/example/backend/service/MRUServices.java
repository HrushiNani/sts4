package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.Mobiles;
import com.example.backend.entity.Students;
import com.example.backend.repo.MRURepo;

@Service

public class MRUServices {
	@Autowired
	private MRURepo repo;
	public List<Students> getAllStudents(){
		return repo.findAll();
	}
	
	

}
