package com.example.webday11.service.impl;

import org.springframework.stereotype.Service;

import com.example.webday11.entity.Student;
import com.example.webday11.repository.StudentRepository;
import com.example.webday11.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Student findById(int id) {
		return studentRepository.findById(id);
	}

}
