package com.restapi.course_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApplication {

	public static void main(String[] args) {
		System.out.println("================================Jenkins build-======")
		SpringApplication.run(CourseApiApplication.class, args);
	}

}
