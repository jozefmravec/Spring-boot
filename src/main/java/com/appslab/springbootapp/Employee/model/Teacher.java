package com.appslab.springbootapp.Employee.model;

import javax.persistence.Entity;

@Entity
public class Teacher extends Employee {


    public Teacher(float salary, int bonus) {
        super(salary, bonus, Employment.TEACHER);
    }

}
