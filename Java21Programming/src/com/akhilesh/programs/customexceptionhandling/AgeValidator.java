package com.akhilesh.programs.customexceptionhandling;

public class AgeValidator {
    public void validateAge(int age) throws NotValidAgeException{
        if(age<18){
            throw  new NotValidAgeException("You are not allowed to vote...");
        }else{
            System.out.println("You are allowed to vote...");
        }

    }
}
