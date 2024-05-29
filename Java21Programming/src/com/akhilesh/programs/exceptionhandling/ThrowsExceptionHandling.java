package com.akhilesh.programs.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsExceptionHandling {

    public void readFile() throws IOException {

            File file = new File("abc.txt");
            FileInputStream fileInputStream = new FileInputStream(file);

    }

    public static void main(String args[]){
        ThrowsExceptionHandling throwsExceptionHandling = new ThrowsExceptionHandling();
        try {
            throwsExceptionHandling.readFile();
        } catch ( IOException  ioException ){
            System.out.println("IOException : "+ ioException.getMessage() );
        }
    }

}
