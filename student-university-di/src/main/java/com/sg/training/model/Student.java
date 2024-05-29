package com.sg.training.model;

public class Student {

    Integer studentId;
    String studentName;
    String universityName;

    public Student(Integer studentId, String studentName, String universityName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
