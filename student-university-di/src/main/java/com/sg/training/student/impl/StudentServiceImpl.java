package com.sg.training.student.impl;

import com.sg.training.model.Student;
import com.sg.training.student.StudentService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> showStudentInfo() {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Rama", "XYZ"));

        return studentList;
    }
}
