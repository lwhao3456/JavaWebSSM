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
		studentDao.add(student);
		return true;
		/*if (result > 0) {
			return true;
		}else {
			return false;
		}*/
	}


	@Override
	public int delete(Integer id) {
		return studentDao.delete(id);
	}


	@Override
	public List<Student> findByName(String name) {
		List<Student> list = studentDao.findByName(name);
		return list;
	}


	@Override
	public boolean update(Student student) {
		studentDao.update(student);
		return true;
	}

	
}
