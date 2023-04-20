package com.example.SpringAnnotation.controller;

import com.example.SpringAnnotation.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    Student s1;

@GetMapping(value="/student")
    public Student getStudent(){
return s1;
}
}
