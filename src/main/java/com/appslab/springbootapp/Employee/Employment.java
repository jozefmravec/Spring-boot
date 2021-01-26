package com.appslab.springbootapp.Employee;

public enum Employment {
    DRIVER("Driver"),
    PROGRAMMER("Programmer"),
    TEACHER("Teacher");

    public String Empoyment;

    Employment(String i) {
        this.Empoyment = i;
    }

    public String getEmpoyment() {
        return Empoyment;
    }

    public void setEmpoyment(String empoyment) {
        Empoyment = empoyment;
    }



}
