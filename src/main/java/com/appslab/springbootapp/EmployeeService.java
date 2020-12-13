package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Work;

import java.util.List;


public interface EmployeeService {
    float salaryNum(List<Work> list);
    int bonusNum(List<Work> list);

    int writeNumber();



}
