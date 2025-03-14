package com.codewithathul.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
//form binding class	
	
	private String name;
	
	private String email;
	
	private String gender;
	
	private String course;
	
	private String [] timings;

}
