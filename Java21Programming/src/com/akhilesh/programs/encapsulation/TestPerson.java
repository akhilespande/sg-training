package com.akhilesh.programs.encapsulation;

public class TestPerson {

    public static void main(String args[]){
       // Creating an Object of person class
        Person person = new Person();
        // changing age value using setter method
        person.setAge(18);

        // accessing age via getter method
        System.out.println("Person Age :"+person.getAge());

    }
}
