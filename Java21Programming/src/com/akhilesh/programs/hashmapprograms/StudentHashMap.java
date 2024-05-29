package com.akhilesh.programs.hashmapprograms;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
    public static void main(String args[]){
        HashMap<Student, String> studentStringHashMap = new HashMap<Student, String>();
        Student studentOne = new Student(1, "Ram");
        Student studentTwo = new Student(2, "Sita");


        // put key & value in the Map
        studentStringHashMap.put(studentOne, studentOne.getName() );
        studentStringHashMap.put(studentTwo, studentTwo.getName() );
        System.out.println(" studentStringHashMap : "+studentStringHashMap);
        // get Key & value from Map

        // iterate over Key

        for(Map.Entry<Student, String> studentStringEntry : studentStringHashMap.entrySet() ){
            System.out.println("key & Value:" +studentStringEntry);
        }

       String student = studentStringHashMap.get(studentOne);
        System.out.println("Value against student one : "+ student);
    }
}
