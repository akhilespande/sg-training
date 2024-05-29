package com.akhilesh.programs.multipleinheritanceusinginterfaces;

public class Student implements College,Hostel{
    @Override
    public void collegeDetails() {
        System.out.println("College Name : Raja Rajeswari");
    }

    @Override
    public void studentDetails() {
       System.out.println("Courses of Student : MBBS 1st , 2nd , 3rd, 4th");
    }

    @Override
    public void hostelDetails() {
        System.out.println("Hostel Name : King Palace");
    }

    @Override
    public void studentRecord() {
      System.out.println("Students are selected based on NEET score");
    }
}
