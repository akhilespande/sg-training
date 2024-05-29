package com.akhilesh.programs.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DivideByZero {
    public static void main(String args[]){
      try {
            int number = 10 / 0;
            System.out.println("Result : " +number );
          File file = new File("abc.txt");
          FileInputStream fileInputStream = new FileInputStream(file);
        }
      catch (ArithmeticException exception){
          System.out.println("ArithmeticException : "+ exception.getMessage());
      }
      catch (IOException exception){
          System.out.println("IOException : "+ exception.getMessage());
      }
      catch (Exception exception){
            System.out.println("Exception : "+ exception.getMessage());
        }

      finally {
          System.out.println("Rest of the code");
      }
    }
}
