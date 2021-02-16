package com.appslab.springbootapp.Employee.model;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public enum Employment {
    DRIVER("Driver"),
    PROGRAMMER("Programmer"),
    TEACHER("Teacher");

    public String Empoyment;

    Employment(String i) {
        this.Empoyment = i;
    }

    public String getEmpoyment() {
        return this.name();
    }

    public void setEmpoyment(String empoyment) {
        Empoyment = empoyment;
    }



}
