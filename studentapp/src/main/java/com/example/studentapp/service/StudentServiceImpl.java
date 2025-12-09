package com.example.studentapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentapp.entity.Student;
import com.example.studentapp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;
	
	@Override
	public Student saveStudent(Student stu) {
		Student savedStu = repository.save(stu);
		return savedStu;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = repository.findAll();
		return students;
	}

	@Override
	public Student getStudentById(Long id) {
		Optional<Student> stuOptl = repository.findById(id);
		return stuOptl.isPresent() ? stuOptl.get() : null;
	}

	@Override
	public void deleteStudent(Long id) {
		repository.deleteById(id);
	}

}
