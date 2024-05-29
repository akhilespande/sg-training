package com.akhilesh.programs.hashmapprograms;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String args[]){
        HashMap<Integer, String > languageMap = new HashMap<>();
        languageMap.put(1, "Rust");
        languageMap.put(2,"Java");
        languageMap.put(3,"C");
        System.out.println("The Original Map :"+ languageMap);
        System.out.println("value at key 1"+languageMap.get(1));

        languageMap.remove(2);

        System.out.println("The Original Map :"+ languageMap);

        // iterating over map

        for(Map.Entry<Integer, String> language : languageMap.entrySet()){
            System.out.println("Key & value : "+language);
        }

        for ( Integer key : languageMap.keySet()){
            System.out.println("Key : "+key);
        }

        for(String  value : languageMap.values()){
            System.out.println("Value : "+value);
        }

    }
}
