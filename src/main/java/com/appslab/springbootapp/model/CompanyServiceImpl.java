package com.appslab.springbootapp.model;

import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService{
   public CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void saveCompany(Company company) {
        companyRepository.save(company);
    }
}
