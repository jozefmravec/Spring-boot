package com.appslab.springbootapp.model;

import com.appslab.springbootapp.Employee.Employment;

public class Driver extends Work {
    public Driver(float salary, int bonus) {
        super(salary, bonus, Employment.DRIVER);

    }
}
