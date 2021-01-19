package com.appslab.springbootapp.Employee;

import com.appslab.springbootapp.model.Work;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeServicempl implements EmployeeService {
    int number = 0;
    @Override
    public float salaryNum(List<Work> list)
    {
       return (float) list.stream()
                .mapToDouble(Work::getSalary).sum();
    }

    @Override
    public int bonusNum(List<Work> list) {
        return list.stream()
                .mapToInt(Work::getBonus).sum();
    }

    @Override
    public int writeNumber()
    {
        number += 1;
        return number;
    }
}
