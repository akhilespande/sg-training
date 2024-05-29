package com.akhilesh.programs.hashtableprograms;

import java.util.Hashtable;
import java.util.Iterator;

public class TestHashTable {
    public static void main(String args[]){
        // create HashTable
        Hashtable<Integer, String>  namesHashTable = new Hashtable<>();

        //  adding elements(names) to hashtable

        namesHashTable.put(1, "David");
        namesHashTable.put(2,"Miller");
        namesHashTable.put(3,"Smith");
        namesHashTable.put(4,"John");

        System.out.println("original hashtable :"+ namesHashTable);

        // get the element(name) based on key

        System.out.println("Name at index 1st : "+ namesHashTable.get(1));

        // Remove element

        System.out.println("Remove at 2nd Index : "+ namesHashTable.remove(2));

        // iterate over elements


        Iterator<Integer> integerIterator = namesHashTable.keySet().iterator();

        while (integerIterator.hasNext()){

         Integer key =   integerIterator.next();
         String value = namesHashTable.get(key);
         System.out.println("key : "+key + " & "+ "value : "+ value);

        }

    }
}
