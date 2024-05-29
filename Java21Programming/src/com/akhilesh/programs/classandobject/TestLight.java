package com.akhilesh.programs.classandobject;

public class TestLight {
    public static void main(String args[]){

        Light led = new Light();
        Light halogen = new Light();

        led.turnOn();

        halogen.turnOff();

    }
}
