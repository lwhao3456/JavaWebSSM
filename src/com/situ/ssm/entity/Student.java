package com.situ.ssm.entity;

import java.io.Serializable;
import java.util.Date;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private int age;
	private String gender;
	private String password;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String name, int age, String gender,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}
	public Student(String name, int age, String gender, String password) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + ", password=" + password + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
