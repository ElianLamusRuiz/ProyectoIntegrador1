package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.Company_has_city;
import com.AgrotechNova.AgroTeachNova.repository.Company_has_cityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Company_has_cityService {

    private final Company_has_cityRepository company_Has_CityRepository;

    public Company_has_cityService(Company_has_cityRepository company_Has_CityRepository) {
        this.company_Has_CityRepository = company_Has_CityRepository;
    }

    public List<Company_has_city> getAll() {
        return company_Has_CityRepository.findAll();
    }
    public Company_has_city getById(Long id) {
        return company_Has_CityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company_has_city not found"));
    }

    public Company_has_city create(Company_has_city companyHasCity) {
        return company_Has_CityRepository.save(companyHasCity);
    }

    public Company_has_city update(Long id, Company_has_city companyHasCity) {
        Company_has_city existing = getById(id);
        // Ajusta estos setters según los campos que tenga tu entidad Company_has_city
        existing.setCompany(companyHasCity.getCompany());
        existing.setCity(companyHasCity.getCity());
        return company_Has_CityRepository.save(existing);
    }

    public void delete(Long id) {
        company_Has_CityRepository.deleteById(id);
    }
}
