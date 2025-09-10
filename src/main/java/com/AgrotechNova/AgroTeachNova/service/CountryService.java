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
    public Country getById(Long id) {
        return countryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Country not found"));
    }

    public Country create(Country country) {
        return countryRepository.save(country);
    }

    public Country update(Long id, Country country) {
        Country existing = getById(id);
        existing.setName(country.getName());
        existing.setCode(country.getCode()); // Ajusta según los campos reales de tu entidad
        return countryRepository.save(existing);
    }

    public void delete(Long id) {
        countryRepository.deleteById(id);
    }
}
