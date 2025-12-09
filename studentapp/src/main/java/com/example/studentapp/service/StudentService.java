package com.example.studentapp.service;

import java.util.List;

import com.example.studentapp.entity.Student;

public interface StudentService {
	Student saveStudent(Student stu);
	List<Student> getAllStudents();
	Student getStudentById(Long id);
	void deleteStudent(Long id);
}
