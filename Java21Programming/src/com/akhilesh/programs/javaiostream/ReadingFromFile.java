package com.akhilesh.programs.javaiostream;

import java.io.*;

public class ReadingFromFile {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("D:\\student.txt")));
       String string ;
        while ((string=bufferedReader.readLine())!=null){
            System.out.println(string);
        }

        bufferedReader.close();
    }
}
