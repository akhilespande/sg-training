package com.akhilesh.programs.inheritance;

public class TestAnimal {
    public static void main(String args[]){
        Dog labrador = new Dog();
        labrador.name = "Andy";
        //  calling display() from dog
        labrador.display();
        //call eat() from Animal
        labrador.eat();
    }
}
