package com.situ.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.situ.ssm.entity.Student;
import com.situ.ssm.service.IStudentService;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	@Resource(name="studentvService")
	private IStudentService studentService;
	
	@RequestMapping(value="/list")
	public String list(Model model){
		List<Student> list = studentService.findAll();
		model.addAttribute("list",list);
		return "student_list";
	}
	@RequestMapping(value="/add")
	public ModelAndView add(Student student){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student",student);
		modelAndView.setViewName("student_list");
		return modelAndView;
		//return "student_list";
		
	}
	
	
}
