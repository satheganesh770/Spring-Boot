package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.Student_Repo;
import com.example.demo.model.Student;
@Service
public class Student_Serviceimpl implements Student_service {
	@Autowired
 private Student_Repo repo;
	@Override
	public Student saveStudent(Student student) {
	
		return repo.save(student);
	}
	@Override
	public Optional<Student> getStudentByid(Integer id) {
		Optional<Student> stu = repo.findById(id);
		return stu;
	}
	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);
		
	}

}
