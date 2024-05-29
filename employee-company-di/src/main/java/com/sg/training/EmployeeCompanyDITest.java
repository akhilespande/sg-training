package com.sg.training;

import com.sg.training.company.Company;
import com.sg.training.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeCompanyDITest {

    public static void main(String args[]){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Company company = applicationContext.getBean(Company.class);
        company.showEmployeeInfo();

    }
}
