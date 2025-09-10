package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.City;
import com.AgrotechNova.AgroTeachNova.repository.CityRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAll() {
        return cityRepository.findAll();
    }
    public City getById(Long id) {
        return cityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("City not found"));
    }

    public City create(City city) {
        return cityRepository.save(city);
    }

    public City update(Long id, City city) {
        City existing = getById(id);
        existing.setName(city.getName());
        existing.setDescription(city.getDescription());
        return cityRepository.save(existing);
    }

    public void delete(Long id) {
        cityRepository.deleteById(id);
    }
}
