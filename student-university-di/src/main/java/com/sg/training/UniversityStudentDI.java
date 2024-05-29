package com.sg.training;

import com.sg.training.config.AppConfig;
import com.sg.training.model.Student;
import com.sg.training.university.UniversityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class UniversityStudentDI {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        UniversityService universityService = applicationContext.getBean(UniversityService.class);
        List<Student> studentList = universityService.getStudentInfo();

        for (Student student: studentList){
            System.out.println(student);
        }
    }
}