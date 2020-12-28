package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Work;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServicempl implements EmployeeService {

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
    int number = 0;
    @Override
    public int writeNumber()
    {
        number += 1;
        return number;
    }
    public static double totalDistance(double height, double length, double tower) {
        double stairs = tower /height;
        return stairs * (height + length);
    }
}
