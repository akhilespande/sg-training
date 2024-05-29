package com.akhilesh.programs.stringprograms;

public class TestString {

    public static void main(String args[]){

        String s1 = "Akhilesh";
        String s4 = s1;
        String s2 = "Pandey";
        String s3 = "Akhilesh";

        System.out.println("s1 : "+ s1.hashCode());
        System.out.println("s2 : "+ s2.hashCode());
        System.out.println("s3 : "+ s3.hashCode());

        System.out.println("s1==s2 : "+s1==s2);
        System.out.println("s1==s4 : "+s1==s4);
        System.out.println("s1.equals(s2) : "+s1.equals(s2));
        System.out.println("s1.equals(s3) : "+s1.equals(s3));

        System.out.println("S1 length : "+ s3.length());
        System.out.println("S1 length : "+ s3.toUpperCase());
    }
}
