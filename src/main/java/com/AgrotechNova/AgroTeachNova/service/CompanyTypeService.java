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

    public List<CompanyType> getAll() {
        return companyTypeRepository.findAll();
    }

    public CompanyType getById(Long id) {
        return companyTypeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("CompanyType not found"));
    }

    public CompanyType create(CompanyType companyType) {
        return companyTypeRepository.save(companyType);
    }

    public CompanyType update(Long id, CompanyType companyType) {
        CompanyType existing = getById(id);
        existing.setName(companyType.getName());
        existing.setDescription(companyType.getDescription());
        return companyTypeRepository.save(existing);
    }

    public void delete(Long id) {
        companyTypeRepository.deleteById(id);
    }
}


