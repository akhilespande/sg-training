package com.sg.training.config;

import com.sg.training.employee.Employee;
import com.sg.training.employee.impl.EmployeeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sg.training.*")
public class AppConfig {

    @Bean
    public Employee getEmployee(){
        return new EmployeeImpl();
    }
}
