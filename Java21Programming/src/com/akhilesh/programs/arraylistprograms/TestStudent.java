package com.akhilesh.programs.arraylistprograms;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String args[]){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Ram",24));
        studentList.add(new Student(2,"David",29));
        studentList.add(new Student(3,"Smith",32));

        for(Student student : studentList){
            System.out.println(student);
        }
    }
}
