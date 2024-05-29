package com.akhilesh.programs.abstractclass;

public class TestVehicle {
    public static void main(String args[]){
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
        vehicle.changeGear();
        vehicle.drive();
    }
}
