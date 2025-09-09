package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.Country;
import com.AgrotechNova.AgroTeachNova.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAll() {
        return countryRepository.findAll();
    }
}