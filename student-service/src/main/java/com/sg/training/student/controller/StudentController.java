package com.sg.training.student.controller;

import com.sg.training.student.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api/students")
public class StudentController {

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return new Student(id, "John Smith");
    }
}

