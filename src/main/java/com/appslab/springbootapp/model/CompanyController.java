package com.appslab.springbootapp.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CompanyController  {
    CompanyService companyService;
    @GetMapping(value="/company")
    public void Company(Company company)
    {
           company = new Company("company");
           companyService.saveCompany(company);
    }

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
}
