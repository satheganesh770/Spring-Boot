package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface Student_Repo extends JpaRepository<Student, Integer>{

}
