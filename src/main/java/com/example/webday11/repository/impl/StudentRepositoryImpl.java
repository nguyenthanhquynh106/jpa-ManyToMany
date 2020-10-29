package com.example.webday11.repository.impl;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.example.webday11.entity.Student;
import com.example.webday11.repository.StudentRepository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	private EntityManager em;

	public StudentRepositoryImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public Student findById(int id) {
		return em.find(Student.class, id);
	}

}
