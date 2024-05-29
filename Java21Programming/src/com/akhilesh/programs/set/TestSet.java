package com.akhilesh.programs.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static  void main(String args[]){
        Set<Integer> integerSet1 = new HashSet<>();

        integerSet1.add(1);
        integerSet1.add(2);
        integerSet1.add(3);
        integerSet1.add(4);

        System.out.println("The 1st original set :"+ integerSet1);

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(4);
        integerSet2.add(5);
        integerSet2.add(6);

        System.out.println("The 2nd Original set : "+ integerSet2);
        // addAll() --> adds all the elements of the specified collection(set) into the set
        integerSet2.addAll(integerSet1);


        System.out.println("Union of the set1 & set2 is :"+ integerSet2);

    }
}
