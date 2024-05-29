package com.akhilesh.programs.multithreading;

public class PrintingResumeThread extends Thread{
    public void run(){
        for(int i=1; i<10 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException.getMessage());
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

    public static void main(String args[]){
        PrintingResumeThread printingResumeThreadOne = new PrintingResumeThread();
        PrintingResumeThread printingResumeThreadTwo = new PrintingResumeThread();
        PrintingResumeThread printingResumeThreadThree = new PrintingResumeThread();
        printingResumeThreadOne.setName("John");
        printingResumeThreadOne.setPriority(1);
        printingResumeThreadTwo.setName("Smith");
        printingResumeThreadThree.setName("Olena");
        printingResumeThreadOne.start();
        printingResumeThreadTwo.start();
     //   printingResumeThreadTwo.suspend();

        printingResumeThreadThree.start();

     printingResumeThreadThree.stop();
      System.out.println("Thread3 is stopped");
        printingResumeThreadThree.start();
     //   printingResumeThreadTwo.resume();

    }
}
