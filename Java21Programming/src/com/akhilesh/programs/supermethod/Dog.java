package com.akhilesh.programs.supermethod;

public class Dog extends Animal{

    // overriding

    public void display(){
        System.out.println("Dog...");
    }

    public void printMessage(){
        display();
        super.display();
    }
}
