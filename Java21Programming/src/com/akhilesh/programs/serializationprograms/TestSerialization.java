package com.akhilesh.programs.serializationprograms;

import java.io.*;


class TestSerialization
{
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try
        {
            Student si = new Student("Akhilesh", 104, "110044");
            FileOutputStream fos = new FileOutputStream("D:\\student.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.flush();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            oos.close();
        }
    }
}

