package com.akhilesh.programs.arraylistprograms;

import java.util.ArrayList;

public class AvgOfNumbers {
    public static void main(String args[]){
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);

        int sum = 0;
        for(int num : integerList){
            sum += num;
        }
        System.out.println(sum);

        int avg = (sum/integerList.size());
        System.out.println(avg);
    }
}
