package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.CompanyType;
import com.AgrotechNova.AgroTeachNova.repository.CompanyTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyTypeService {

    private final CompanyTypeRepository companyTypeRepository;

    public CompanyTypeService(CompanyTypeRepository companyTypeRepository) {
        this.companyTypeRepository = companyTypeRepository;
    }

    public List<CompanyType> getAllCompanyTypes() {
        return companyTypeRepository.findAll();
    }
}
