package com.sg.training.employee.impl;

import com.sg.training.employee.Employee;
import org.springframework.stereotype.Component;


public class EmployeeImpl implements Employee {
    @Override
    public void showEmployeeInfo() {
        System.out.println("Employee info...");
    }
}
