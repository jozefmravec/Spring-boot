package com.appslab.springbootapp.Employee.model;

import com.appslab.springbootapp.Employee.EmployeeService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DependencyInjectionDemo {
    private EmployeeService employeeService;

    List<Employee> listik = Arrays.asList(new Programmer(1700, 200), new Driver(1000,300), new Teacher(900,100));


    public DependencyInjectionDemo(EmployeeService employeeService) {
        this.employeeService = employeeService;
        getSum();
        System.out.println(employeeService.writeNumber());

    }

    public void getSum()
    {
        System.out.println(employeeService.salaryNum(listik) + employeeService.bonusNum(listik));
    }

}
