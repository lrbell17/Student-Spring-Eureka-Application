package com.service;

import java.util.List;

import com.entity.Student;

public interface StudentService {
	
	public void addStudent(Student stu);
	
	public List<Student> findAll();
}
