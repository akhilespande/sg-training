package com.akhilesh.programs.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String args[]){
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(1);

        System.out.println("The original set : "+integerSet );

        Iterator<Integer> integerIterator = integerSet.iterator();

        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

    }
}
