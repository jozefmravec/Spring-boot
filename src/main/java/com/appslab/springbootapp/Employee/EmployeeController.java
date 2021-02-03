package com.appslab.springbootapp.Employee;

import java.util.Arrays;
import java.util.List;

import com.appslab.springbootapp.Company.CompanyService;
import com.appslab.springbootapp.Employee.model.Driver;
import com.appslab.springbootapp.Employee.model.Programmer;
import com.appslab.springbootapp.Employee.model.Teacher;
import com.appslab.springbootapp.Employee.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    EmployeeService employeeService;
    List<Employee> listik = Arrays.asList(new Programmer(1700, 200), new Driver(1000, 300), new Teacher(900, 100));

    @RequestMapping("/hello")
    public String greeting() {
        return "Hello Spring Boot";
    }


    @GetMapping("/salary")
    public float getSalary() {
        return employeeService.salaryNum(listik);
    }

    @GetMapping("/bonus")
    public float getBonus() {
        return employeeService.bonusNum(listik);
    }

    @GetMapping("/snail")

    public double totalDistance(@RequestParam double height, @RequestParam double length, @RequestParam double tower) {
        double stairs = tower / height;
        return stairs * (height + length);
    }

    @PostMapping(value = "/employee")
    public void employee(@RequestBody Employee employee){
      employeeService.saveEmployee(employee);
    }
    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

}

