package com.sg.training.company.impl;

import com.sg.training.company.Company;
import com.sg.training.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompanyImpl implements Company {
    /**
     * displays employee info
     */
    @Autowired
    Employee employee;

    @Override
    public void showEmployeeInfo() {
       employee.showEmployeeInfo();
    }
}
