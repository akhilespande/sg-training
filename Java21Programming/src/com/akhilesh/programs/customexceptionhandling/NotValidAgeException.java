package com.akhilesh.programs.customexceptionhandling;

/*
Creating custom exception
 */
public class NotValidAgeException extends  Exception{
    public NotValidAgeException(String message) {
        super(message); // calling the constructor of Exception class
    }
}
