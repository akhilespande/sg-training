package com.akhilesh.programs.serializationprograms;

import java.io.Serializable;

class Student implements Serializable
{
    String name;
    int rid;
    static String contact;
    Student(String n, int r, String c)
    {
        this.name = n;
        this.rid = r;
        this.contact = c;
    }
}
