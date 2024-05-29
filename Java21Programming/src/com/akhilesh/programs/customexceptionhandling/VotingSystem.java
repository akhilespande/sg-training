package com.akhilesh.programs.customexceptionhandling;

public class VotingSystem {
  public static void main(String args[]){
     AgeValidator ageValidator = new AgeValidator();
    try {
      ageValidator.validateAge(24);
    }catch (NotValidAgeException notValidAgeException){
      System.out.println("Exception : "+ notValidAgeException.getMessage());
    }
  }
}
