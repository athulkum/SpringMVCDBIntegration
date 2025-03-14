package com.codewithathul.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithathul.entity.Student;
import com.codewithathul.entity.StudentEntity;
import com.codewithathul.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;
	
	public List<String> getTimings(){
		
		return Arrays.asList("Morning" ,"AfterNoon","Evening" );
	}
	
	public List<String> getCourses() {
		
		return Arrays.asList("java", "Python", "Spring","Microservice");
	}
	
	public void saveStudent(Student student) {
		StudentEntity  entity = new StudentEntity();
		BeanUtils.copyProperties(student, entity);
		
		entity.setTimings(Arrays.toString(student.getTimings()));
		
		repository.save(entity);
		
	}

}
