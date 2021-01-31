package com.appslab.springbootapp.Employee;

import com.appslab.springbootapp.Employee.model.Employee;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeServicempl implements EmployeeService {
    int number = 0;
    @Override
    public float salaryNum(List<Employee> list)
    {
       return (float) list.stream()
                .mapToDouble(Employee::getSalary).sum();
    }

    @Override
    public int bonusNum(List<Employee> list) {
        return list.stream()
                .mapToInt(Employee::getBonus).sum();
    }

    @Override
    public int writeNumber()
    {
        number += 1;
        return number;
    }
}
