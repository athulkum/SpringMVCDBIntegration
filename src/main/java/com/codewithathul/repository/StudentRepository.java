package com.codewithathul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithathul.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity , Integer> {

}
