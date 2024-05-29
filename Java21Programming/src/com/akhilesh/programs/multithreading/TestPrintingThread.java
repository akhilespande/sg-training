package com.akhilesh.programs.multithreading;

public class TestPrintingThread {
    public static void main(String args[]){
        PrintingThread printingThread = new PrintingThread();

        Thread thread = new Thread(printingThread); //
        thread.start();
    }
}
