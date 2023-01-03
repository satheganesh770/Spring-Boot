package com.example.demo.service;


import java.util.Optional;

import com.example.demo.model.Student;

public interface Student_service {
public Student saveStudent(Student student);
public Optional<Student>  getStudentByid(Integer id);
public void deleteById(Integer id);
	

}
