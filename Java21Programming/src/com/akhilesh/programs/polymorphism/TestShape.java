package com.akhilesh.programs.polymorphism;

public class TestShape {
    public static void main(String args[]){
        // Create an Object of Circle
        Circle circle = new Circle();
        circle.render();

        Square square = new Square();
        square.render();
    }
}
