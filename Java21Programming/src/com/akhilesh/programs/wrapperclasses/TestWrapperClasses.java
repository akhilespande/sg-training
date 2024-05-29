package com.akhilesh.programs.wrapperclasses;

public class TestWrapperClasses {
    public static void main(String args[]){

        int a = 10;
        float b = 20f;
        double c = 30.0;
   // Converting primitive to wrapper classes
       Integer n1 = Integer.valueOf(a);
       Float n2 =  Float.valueOf(b);
       Double n3 = Double.valueOf(c);

      System.out.println("n1: "+n1+", n2 : "+ n2 + ", n3 :"+ n3);

      if(n1 instanceof Integer){
          System.out.println("Its an Integer");
      }
      if (n2 instanceof Float){
          System.out.println("Its an Float");
      }
      if(n3 instanceof  Double){
          System.out.println("Its an Double");
      }


        // Converting Wrapper classes to primitive

         int x=  n1.intValue();
         float y = n2.floatValue();
         double z = n3.doubleValue();

        System.out.println(x+ " , "+ y+ " , "+z);

    }
}
