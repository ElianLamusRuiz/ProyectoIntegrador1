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
}
