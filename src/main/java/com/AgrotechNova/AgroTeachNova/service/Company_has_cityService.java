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
}
