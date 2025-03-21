package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.Mobiles;
import com.example.backend.entity.Students;
import com.example.backend.service.MRUServices;

@RestController
@CrossOrigin("*")

public class MRUController {
	@Autowired
	private MRUServices service;
	@GetMapping("/Students")
	public List<Students> getAllStudents(){
		return service.getAllStudents();
	}

}
