package com.appslab.springbootapp.Employee;

import org.springframework.stereotype.Component;

@Component
public class EmployeeSecond {
    public EmployeeSecond(EmployeeService employeeService) {
        System.out.println(employeeService.writeNumber());
    }

}
