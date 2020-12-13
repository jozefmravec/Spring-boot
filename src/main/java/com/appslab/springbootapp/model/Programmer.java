package com.appslab.springbootapp.model;


public class Programmer extends Work {

    public String getInf(int total)
    {
        total = (int) (salary + bonus);
        return emp.Empoyment + "´s salary is " + total;
    }

    public Programmer(float salary, int bonus) {
        super(salary, bonus, Employment.PROGRAMMER);

    }


}
