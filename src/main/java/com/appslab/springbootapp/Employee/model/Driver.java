package com.appslab.springbootapp.Employee.model;

import javax.persistence.Entity;

@Entity
public class Driver extends Employee {
    public Driver(float salary, int bonus) {
        super(salary, bonus, Employment.DRIVER);

    }
}
