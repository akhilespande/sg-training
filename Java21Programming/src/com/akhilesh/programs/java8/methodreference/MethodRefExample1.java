package com.akhilesh.programs.java8.methodreference;

import java.util.ArrayList;
import java.util.List;

public class MethodRefExample1 {

        public static void main(String args[]) {
            List<String> names = new ArrayList<String>();

            names.add("John");
            names.add("Devid");
            names.add("Smith");
            names.add("Miller");
            names.add("Olena");

            names.forEach(System.out::println);
        }
    }
