package com.akhilesh.programs.javaiostream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFromFile {

    public static void main(String args[]) throws IOException {
        String text = "Hello , Good Evening";
        FileWriter fileWriter = new FileWriter(new File("D:\\akhilesh.txt"));
        fileWriter.write(text);
        fileWriter.flush();
        fileWriter.close();
    }
}
