package com.hrushi.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	@RequestMapping("/courses")
	public List<Course> retrieveCourses(){
		return Arrays.asList(
				new Course(1,"Learn Spring-Boot", "Hrushi"),
				new Course(2,"Learn Docker", "Hrushi"),
				new Course(3,"Learn AWS", "Hrushi")
		       );
				
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
