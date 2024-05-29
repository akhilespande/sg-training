package com.akhilesh.programs.serializationprograms;

import java.io.*;

class TestDeserialization
{
    public static void main(String[] args)
    {
        Student si=null ;
        try
        {
            FileInputStream fis = new FileInputStream("D:\\student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            si = (Student)ois.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace(); }
        System.out.println(si.name);
        System.out. println(si.rid);
        System.out.println(si.contact);
    }
}

