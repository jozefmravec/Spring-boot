package com.appslab.springbootapp.Company;

import com.appslab.springbootapp.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CompanyController  {
    CompanyService companyService;
    @GetMapping(value="/company")
    public void Company()
    {
        Address address = new Address("Hurbanova 37", "01308", "Žilina", "Slovakia");
        Company company = new Company("company", address);
        companyService.saveCompany(company);
    }

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
}
