package com.restapi.course_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

record Course(String name, String category) {

}
@RestController
public class CourseController {
    public static List<Course> courseList = new ArrayList<>();

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
          System.out.println("========Merged into main==========");
         return courseList;
    }

    @PostMapping("/courses")
    public ResponseEntity addCourse(@RequestBody Course course) {
        courseList.add(course);
        return ResponseEntity.ok().build();
    }

}
