package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.entity.Student;

public interface IStudentService {

	public List<Student> findAll();
	
	public boolean add(Student student);
}
