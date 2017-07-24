package com.situ.ssm.dao;

import java.util.List;

import com.situ.ssm.entity.Student;

public interface StudentDao {

	/**
	 * 查询所有学生信息
	 * @return
	 */
	public List<Student> findAll();
	
	/**
	 * 添加学生
	 * @param student
	 * @return
	 */
	public void add(Student student);
	
	/**
	 * 删除学生
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	/**
	 * 根据姓名查找学生
	 * @param name
	 * @return
	 */
	public List<Student> findByName(String name);
	
	
	public void update(Student student);
}
