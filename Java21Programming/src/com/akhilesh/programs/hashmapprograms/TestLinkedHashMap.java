package com.akhilesh.programs.hashmapprograms;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {

    public static void main(String args[]){
        LinkedHashMap<String , Integer> evenLinkedHashMap = new LinkedHashMap<>();
        evenLinkedHashMap.put("Two",2);
        evenLinkedHashMap.put("Four",4);

        LinkedHashMap<String,Integer> numberLinkedHashMap = new LinkedHashMap<>();
        numberLinkedHashMap.put("One",1);
        numberLinkedHashMap.put("Three", 3);

        numberLinkedHashMap.putAll(evenLinkedHashMap);
        System.out.println("Update linked hash map "+ numberLinkedHashMap);


    }
}
