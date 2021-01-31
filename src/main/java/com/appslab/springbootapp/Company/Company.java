package com.appslab.springbootapp.Company;

import com.appslab.springbootapp.Employee.model.Address;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    @OneToOne (cascade = CascadeType.ALL)
    @NotNull
    Address address;
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
