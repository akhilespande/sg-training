package com.akhilesh.programs.arraylistprograms;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[]){

        ArrayList<String> studentList = new ArrayList<>();
        System.out.println("Adding Elements in ArrayList");
        studentList.add("Ram");
        studentList.add("David");
        studentList.add("Smith");
        studentList.add("Mohan");

        System.out.println("Student List before adding element at 2nd position :"+ studentList);
        // adding element at 2nd index
        studentList.add(2, "Shyam");

        System.out.println("Student List after adding element at 2nd position :"+ studentList);
        // getting element at 1st index
       String studentAtFirstIndex = studentList.get(1);
       System.out.println("Student at first index :"+ studentAtFirstIndex);

       // changing the element
        studentList.set(1,"Ghanshyam");

        System.out.println("Student List after changing element at 1st position :"+ studentList);

       System.out.println("Size : "+studentList.size());

        System.out.println("Iterating over list");

       for(String name : studentList){
           System.out.println(name);
       }

    }
}
