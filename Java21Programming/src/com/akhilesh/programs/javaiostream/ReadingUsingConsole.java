package com.akhilesh.programs.javaiostream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingUsingConsole {
    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String string =  bufferedReader.readLine();
        System.out.println("String : "+ string);

    }
}
