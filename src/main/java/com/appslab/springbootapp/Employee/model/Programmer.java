package com.appslab.springbootapp.Employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Programmer extends Employee {

    public String getInf(int total)
    {
        total = (int) (salary + bonus);
        return employee.Empoyment + "´s salary is " + total;
    }

    public Programmer(float salary, int bonus) {
        super(salary, bonus, Employment.PROGRAMMER);

    }


}
