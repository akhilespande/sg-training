package com.sg.training.school.controller;
import com.sg.training.school.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("v1/api/schools")
public class SchoolController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentInfo(@PathVariable Integer id) {
        Student student = restTemplate.getForObject("http://student-service:8081/v1/api/students/student/{id}", Student.class, id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
