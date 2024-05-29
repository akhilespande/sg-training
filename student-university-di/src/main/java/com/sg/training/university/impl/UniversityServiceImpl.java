package com.sg.training.university.impl;

import com.sg.training.model.Student;
import com.sg.training.student.StudentService;
import com.sg.training.university.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UniversityServiceImpl implements UniversityService {
    StudentService studentService;

    @Autowired
    UniversityServiceImpl(StudentService studentService){
        this.studentService=studentService;
    }


    @Override
    public List<Student> getStudentInfo() {
        return studentService.showStudentInfo();
    }
}
