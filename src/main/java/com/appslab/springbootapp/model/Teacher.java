package com.appslab.springbootapp.model;


import com.appslab.springbootapp.Employee.Employment;

public class Teacher extends Work {


    public Teacher(float salary, int bonus) {
        super(salary, bonus, Employment.TEACHER);
    }

}
