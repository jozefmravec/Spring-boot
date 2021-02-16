package com.appslab.springbootapp.Company;

import com.appslab.springbootapp.Employee.model.Address;
import com.appslab.springbootapp.Employee.model.Employee;
import com.appslab.springbootapp.Employee.model.Employment;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    @OneToOne (cascade = CascadeType.ALL)
    @NotNull
    Address address;
    @OneToMany(mappedBy = "company")
    Set<Employee> employees;


    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
