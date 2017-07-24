package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.entity.Student;

public interface IStudentService {

	public List<Student> findAll();
	
	public abstract boolean add(Student student);
	
	public abstract int delete(Integer id);
	
	public abstract List<Student> findByName(String name);
	
	public abstract boolean update(Student student);
}
