package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class StudentCrud1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentCrud1Application.class, args);
	}

}
