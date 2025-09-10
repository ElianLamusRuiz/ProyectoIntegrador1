package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.Company;
import com.AgrotechNova.AgroTeachNova.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAll() {
        return companyRepository.findAll();
    }
    public Company getById(Long id) {
        return companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found"));
    }

    public Company create(Company company) {
        return companyRepository.save(company);
    }

    public Company update(Long id, Company company) {
        Company existing = getById(id);
        existing.setName(company.getName());
        existing.setDescription(company.getDescription());
        return companyRepository.save(existing);
    }

    public void delete(Long id) {
        companyRepository.deleteById(id);
    }
}
