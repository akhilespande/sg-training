package com.akhilesh.programs.multithreading;

public class TestPrintingThreadUsingSleep {
    public static void main(String args[]){
        PrintingThreadUsingSleep printingThreadUsingSleepOne = new PrintingThreadUsingSleep();
        PrintingThreadUsingSleep printingThreadUsingSleepTwo = new PrintingThreadUsingSleep();
        PrintingThreadUsingSleep printingThreadUsingSleepThree = new PrintingThreadUsingSleep();

        printingThreadUsingSleepOne.start();
        printingThreadUsingSleepTwo.start();
        printingThreadUsingSleepThree.start();
    }
}
