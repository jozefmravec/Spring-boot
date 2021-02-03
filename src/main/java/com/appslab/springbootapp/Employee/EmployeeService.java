package com.appslab.springbootapp.Employee;

import com.appslab.springbootapp.Company.Company;
import com.appslab.springbootapp.Employee.model.Employee;

import java.util.List;


public interface EmployeeService {
    void saveEmployee(Employee employee);

    float salaryNum(List<Employee> list);
    int bonusNum(List<Employee> list);

    int writeNumber();



}
