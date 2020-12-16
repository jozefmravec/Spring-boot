package com.appslab.springbootapp.model;

import java.util.Arrays;
import java.util.List;

import com.appslab.springbootapp.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController  {
    EmployeeService employeeService;
    List<Work> listik = Arrays.asList(new Programmer(1700, 200), new Driver(1000,300), new Teacher(900,100));

    @RequestMapping("/hello")
    public  String greeting(){
        return "Hello Spring Boot";
    }

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/salary")
    public float getSalary(){
        return employeeService.salaryNum(listik);
    }
    @GetMapping("/bonus")
    public float getBonus(){
        return employeeService.bonusNum(listik);
    }



}
