package com.appslab.springbootapp.Employee;

import com.appslab.springbootapp.Company.Company;
import com.appslab.springbootapp.Company.CompanyRepository;
import com.appslab.springbootapp.Employee.model.Employee;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServicempl implements EmployeeService {
    EmployeeRepository employeeRepository;
    int number = 0;


    public EmployeeServicempl (EmployeeRepository employeeRepository) {
      this.employeeRepository =   employeeRepository;
    }
    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);

    }

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
