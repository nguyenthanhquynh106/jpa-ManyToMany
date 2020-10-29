package com.example.webday11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday11.entity.Faculty;
import com.example.webday11.service.FacultyService;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

	private FacultyService facultyService;

	public FacultyController(FacultyService facultyService) {
		this.facultyService = facultyService;
	}

	@GetMapping("/{id}")
	public Faculty findById(@PathVariable int id) {
		return facultyService.findById(id);
	}
}
