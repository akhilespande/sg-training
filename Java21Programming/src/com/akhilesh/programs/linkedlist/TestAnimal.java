package com.akhilesh.programs.linkedlist;

import java.util.LinkedList;

public class TestAnimal {
    public static void main(String args[]){
        LinkedList<String> animalLinkedList = new LinkedList<>();
        animalLinkedList.add("Dog");
        animalLinkedList.add("Cat");
        animalLinkedList.add("Cow");

        System.out.println("The orginal linked list :"+ animalLinkedList);
        // adding element at index 1

        animalLinkedList.add(1,"Horse");

        System.out.println("After adding element at index 1 :"+ animalLinkedList);

        animalLinkedList.remove(2);

        System.out.println("After removing element at index 2 :"+ animalLinkedList);

        for(String name : animalLinkedList){
            System.out.println("Animal: "+ name);
        }

        System.out.println("The size of linkedlist : "+ animalLinkedList.size());

    }
}
