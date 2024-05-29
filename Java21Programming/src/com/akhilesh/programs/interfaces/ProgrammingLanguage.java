package com.akhilesh.programs.interfaces;

public class ProgrammingLanguage implements Language{
    @Override
    public void getName(String name) {
        System.out.println("Language name : "+ name);
    }
}
