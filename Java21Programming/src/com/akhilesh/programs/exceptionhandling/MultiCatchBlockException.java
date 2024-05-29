package com.akhilesh.programs.exceptionhandling;

public class MultiCatchBlockException {
    public static void main(String args[]){

        try{
            int a[] = new int[5];
            a[5] = 10/0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException  exception){
            System.out.println("ArithmeticException : "+ exception.getMessage());
        }

    }
}
