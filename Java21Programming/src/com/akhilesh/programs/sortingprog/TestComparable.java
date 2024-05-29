package com.akhilesh.programs.sortingprog;

public class TestComparable {
    public static void main(String args[]){
        Student studentOne = new Student("John", 9, 1001);
        Student studentTwo = new Student("Smith", 7, 1002);
        int result = studentOne.compareTo(studentTwo);

        if(result>0){
            String name = studentOne.getName();
            System.out.println(name+ " Has higher cgpa");
        }else if(result<0){
            String name = studentTwo.getName();
            System.out.println(name+"  has higher cgpa");
        } else
            System.out.println(studentOne.getName()+ " and " + studentTwo.getName() + " has same cgpa");
    }
}
