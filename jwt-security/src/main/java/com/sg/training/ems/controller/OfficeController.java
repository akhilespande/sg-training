package com.sg.training.ems.controller;

import com.sg.training.ems.domain.Employee;
import com.sg.training.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/office")
public class OfficeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/access")
    public ResponseEntity<List<Employee>> accessOffice(Authentication authentication) {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }
}

