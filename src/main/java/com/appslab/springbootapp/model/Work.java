package com.appslab.springbootapp.model;


import com.appslab.springbootapp.model.Employment;

public class Work {
    float salary;
    int bonus;
    Employment emp;
    public Work(float salary, int bonus, Employment emp) {
        this.salary = salary;
        this.bonus = bonus;
        this.emp = emp;
    }
    public String getInfo()
    {
        return emp.Empoyment + "´s salary is " + salary + " and bonus is " + bonus;
    }
    public float getSalary()
    {
        return salary;
    }
    public int getBonus()
    {
        return bonus;
    }

}
