package com.akhilesh.programs.abstractclass;

public class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Starting ...");
    }

    @Override
    void stop() {
        System.out.println("Stopping ...");
    }

    @Override
    void drive() {
        System.out.println("Driving ...");
    }

    @Override
    void changeGear() {
     System.out.println("Changing gear");
    }
}
