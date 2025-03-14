package com.codewithathul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codewithathul.entity.Student;
import com.codewithathul.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		
		Student student = new Student();
		model.addAttribute("student", student);
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("timings",service.getTimings());
		return "index";
	}
	
	@PostMapping("/save")
	public String saveStudent(Student s, Model model) {
		
		System.out.println(s);
		service.saveStudent(s);
		model.addAttribute("msg", "Student Saved");
		return "index";
	}
	
}
