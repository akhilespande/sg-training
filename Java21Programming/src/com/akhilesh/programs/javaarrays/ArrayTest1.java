package com.akhilesh.programs.javaarrays;

public class ArrayTest1 {
    public static void main(String args[]){
       // int studentAge[] = {12,13,15,16,18};
       // int[] studentAge = {12,13,15,16,18};
        int []studentAge = {12,13,15,16,18}; // 0 to n-1(4)
        System.out.println("Value at index 1st : "+ studentAge[0]);
        System.out.println("Length : "+studentAge.length);
       /* for(int i=0 ; i< studentAge.length ; i++){
           System.out.println(studentAge[i]);
        }*/

        for(int age : studentAge){
            System.out.println(age);
        }
    }
}
