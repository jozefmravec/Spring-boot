package com.appslab.springbootapp.Employee;

import com.appslab.springbootapp.Company.Company;
import com.appslab.springbootapp.Employee.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
