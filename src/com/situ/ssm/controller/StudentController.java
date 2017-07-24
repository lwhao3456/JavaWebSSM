package com.situ.ssm.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.situ.ssm.entity.Student;
import com.situ.ssm.service.IStudentService;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	@Resource(name="studentService")
	private IStudentService studentService;
	
	
	/**
	 * 学生列表
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list")
	public String list(Model model){
		List<Student> list = studentService.findAll();
		model.addAttribute("list",list);
		return "student_list";
	}
	
	/**
	 * 添加学生
	 * @param student
	 * @return
	 */
	@RequestMapping(value="/add")
	public String add(Student student){
		System.out.println(student);
		studentService.add(student);
		return "redirect:/student/list.action";
	}
	
	/**
	 * 删除学生
	 * @param id
	 * @return
	 */
	
	@RequestMapping(value="/delete")
	public String delete(int id){
		studentService.delete(id);
		return "redirect:/student/list.action";
	}
	
	/**
	 * 根据姓名查找学生
	 * @param model
	 * @param name
	 * @return
	 */
	
	@RequestMapping(value="/findByName")
	public String findByName(Model model,String name){
		List<Student> list = studentService.findByName(name);
		return "forward:/student/list.action";
	}
	
	@RequestMapping(value="/update")
	public String update(Student student){
		System.out.println(student);
		studentService.update(student);
		return "redirect:/student/list.action";
	}
}
