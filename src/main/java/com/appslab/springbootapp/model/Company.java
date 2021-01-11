package com.appslab.springbootapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    private String name;
}
