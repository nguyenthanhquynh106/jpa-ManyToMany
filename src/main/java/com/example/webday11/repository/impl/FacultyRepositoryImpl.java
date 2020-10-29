package com.example.webday11.repository.impl;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.example.webday11.entity.Faculty;
import com.example.webday11.repository.FacultyRepository;

@Repository
public class FacultyRepositoryImpl implements FacultyRepository {

	private EntityManager em;

	public FacultyRepositoryImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public Faculty findById(int id) {
		Faculty faculty = em.find(Faculty.class, id);
		return faculty;
	}

}
