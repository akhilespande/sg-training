package com.akhilesh.programs.multithreading;

public class PrintingThreadUsingSleep extends Thread {

    public void run(){
        for(int i=1 ; i<10 ; i++){
            System.out.println("Thread Name : "+ Thread.currentThread().getName() + " " +i);
            try {
                Thread.sleep(5000);

            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            ;

        }
    }
}
