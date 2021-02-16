package com.appslab.springbootapp.Employee.model;


import com.appslab.springbootapp.Company.Company;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.Type;


import javax.persistence.*;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "employee"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Driver.class, name = "driver"),
        @JsonSubTypes.Type(value = Programmer.class, name = "programmer"),
        @JsonSubTypes.Type(value = Teacher.class, name = "teacher"),

}
)

@Table(name = "employee")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    float salary;
    int bonus;
    @Enumerated(EnumType.STRING)
    Employment employee;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id", insertable = false,updatable = false, nullable = false)
    private Company company;
    @Column(name = "company_id")
    private long companyId;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Employment getEmployee() {
        return employee;
    }

    public void setEmployee(Employment employee) {
        this.employee = employee;
    }

    public Employee(float salary, int bonus, Employment employee) {
        this.salary = salary;
        this.bonus = bonus;
        this.employee = employee;
    }
    public String getInfo()
    {
        return employee.Empoyment + "´s salary is " + salary + " and bonus is " + bonus;
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
