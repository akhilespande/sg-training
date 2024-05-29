package com.akhilesh.programs.multithreading;

public class PrintThreadPriority extends Thread {

    public void run(){
        System.out.println("Running thread name : "+ Thread.currentThread().getName());
    }

    public static void main(String args[]){
        PrintThreadPriority printThreadPriorityOne = new PrintThreadPriority();
        PrintThreadPriority printThreadPriorityTwo = new PrintThreadPriority();
        printThreadPriorityOne.setPriority(Thread.MIN_PRIORITY);
        printThreadPriorityTwo.setPriority(Thread.MAX_PRIORITY);
        printThreadPriorityOne.setName("Ram");
        printThreadPriorityTwo.setName("Sita");
        System.out.println("PrintThreadPriorityOne : "+printThreadPriorityOne.getPriority());
        System.out.println("PrintThreadPriorityTwo : "+printThreadPriorityTwo.getPriority());

        printThreadPriorityOne.start();
        printThreadPriorityTwo.start();
    }
}
