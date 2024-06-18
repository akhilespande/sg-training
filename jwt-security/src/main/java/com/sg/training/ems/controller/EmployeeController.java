package com.sg.training.ems.controller;

import com.sg.training.ems.domain.Employee;
import com.sg.training.ems.domain.IDCard;
import com.sg.training.ems.service.EmployeeService;
import com.sg.training.ems.service.IDCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private IDCardService idCardService;

    @PostMapping("/register")
    public ResponseEntity<?> registerEmployee(@RequestBody Employee employee) {
        logger.info("Registering employee: {}", employee.getName());
        Employee savedEmployee = employeeService.saveEmployee(employee);
        IDCard idCard = idCardService.issueIDCard(savedEmployee, "CARD-" + savedEmployee.getId());
        logger.info("Employee registered and ID card issued: {}", savedEmployee.getName());
        return ResponseEntity.ok("Employee registered successfully, ID card issued: " + idCard.getCard_number());
    }
}
