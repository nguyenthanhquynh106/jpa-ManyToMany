package com.example.webday11.service.impl;

import org.springframework.stereotype.Service;

import com.example.webday11.entity.Faculty;
import com.example.webday11.repository.FacultyRepository;
import com.example.webday11.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService {

	private FacultyRepository facultyRepository;

	public FacultyServiceImpl(FacultyRepository facultyRepository) {
		this.facultyRepository = facultyRepository;
	}

	@Override
	public Faculty findById(int id) {
		return facultyRepository.findById(id);
	}

}
