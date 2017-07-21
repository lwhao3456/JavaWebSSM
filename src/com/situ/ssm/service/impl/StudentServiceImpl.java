package com.situ.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.situ.ssm.dao.StudentDao;
import com.situ.ssm.entity.Student;
import com.situ.ssm.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService{

	@Resource(name="studentDao")
	private StudentDao studentDao;
	
	
	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}


	@Override
	public boolean add(Student student) {
		return studentDao.add(student);
	}

	
}
