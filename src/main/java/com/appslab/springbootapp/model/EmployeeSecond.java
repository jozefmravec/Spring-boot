package com.appslab.springbootapp.model;

import com.appslab.springbootapp.EmployeeService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeSecond {
    public EmployeeSecond(EmployeeService employeeService) {
        System.out.println(employeeService.writeNumber());
    }

}
