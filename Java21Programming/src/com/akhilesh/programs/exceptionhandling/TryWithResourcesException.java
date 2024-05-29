package com.akhilesh.programs.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesException {
    public static void main(String args[]){
        String line ;
        // try with resources
        try(BufferedReader bufferedReader = new BufferedReader((new FileReader("abc.txt")))){
            while ((line=bufferedReader.readLine()) !=null){
                System.out.println("Line :"+ line);
            }
        }catch (IOException ioException){
            System.out.println("IOException :"+ ioException.getMessage());

        }

    }
}
