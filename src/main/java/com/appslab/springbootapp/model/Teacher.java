package com.appslab.springbootapp.model;


public class Teacher extends Work {


    public Teacher(float salary, int bonus) {
        super(salary, bonus, Employment.TEACHER);
    }

}
