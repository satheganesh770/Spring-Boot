package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.Student_service;
@RestController
@RequestMapping("/student")
public class Student_Controller {
	@Autowired
	private Student_service Service;
	@PostMapping("/save")
	public ResponseEntity<Student>saveEmployee(@RequestBody Student student) {
	Student stu = Service.saveStudent(student);
	return ResponseEntity.ok().body(stu);
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Student>> findById(@PathVariable  Integer id){
		Optional<Student> getid = Service.getStudentByid(id);
		
		return ResponseEntity.ok().body(getid);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteid(@PathVariable  Integer id) {
		Service.deleteById(id);
	}
}
