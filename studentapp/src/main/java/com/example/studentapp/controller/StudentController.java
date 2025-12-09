package com.example.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentapp.entity.Student;
import com.example.studentapp.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping
	public Student create(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@GetMapping
	public List<Student> getAll(){
		return service.getAllStudents();
	}	
}
