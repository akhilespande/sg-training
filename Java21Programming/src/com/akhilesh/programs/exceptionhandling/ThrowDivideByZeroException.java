package com.akhilesh.programs.exceptionhandling;

class ThrowDivideByZeroException {
    public void divideByZero(){
        throw new ArithmeticException("Trying to divide by Zero");
    }
    public static void main(String args[]){
        ThrowDivideByZeroException throwDivideByZeroException  = new ThrowDivideByZeroException();
        throwDivideByZeroException.divideByZero();
    }
}
