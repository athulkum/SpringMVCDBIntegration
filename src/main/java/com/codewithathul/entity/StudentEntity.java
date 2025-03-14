package com.codewithathul.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Entity(name = "StudentEntity")
@Data
public class StudentEntity {
	
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String email;
	
	private String gender;
	
	private String course;
	
	private String timings;

}
