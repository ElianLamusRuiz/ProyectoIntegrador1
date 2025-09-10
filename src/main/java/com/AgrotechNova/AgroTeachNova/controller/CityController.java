package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.City;
import com.AgrotechNova.AgroTeachNova.service.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class CityController {

    private final CityService CityService;

    public CityController(CityService CityService) {
        this.CityService = CityService;
    }

    // Endpoint de prueba para mañana empezar a expandir
    @GetMapping
    public List<City> getAllCities() {
        return CityService.getAll();
    }
@GetMapping("/{id}")
    public City getById(@PathVariable Long id) {
        return CityService.getById(id);
    }

    @PostMapping
    public City create(@RequestBody City body) {
        return CityService.create(body);
    }

    @PutMapping("/{id}")
    public City update(@PathVariable Long id, @RequestBody City body) {
        return CityService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        CityService.delete(id);
    }
    
}
