package com.appslab.springbootapp.model;

import com.appslab.springbootapp.EmployeeService;
import com.appslab.springbootapp.EmployeeServicempl;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DependencyInjectionDemo {
    EmployeeService employeeService;
    List<Work> listik = Arrays.asList(new Programmer(1700, 200), new Driver(1000,300), new Teacher(900,100));


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
