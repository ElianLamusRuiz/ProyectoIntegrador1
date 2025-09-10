package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.Company_has_city;
import com.AgrotechNova.AgroTeachNova.service.Company_has_cityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class Company_has_cityController {

    private final Company_has_cityService Company_has_cityService;

    public Company_has_cityController(Company_has_cityService Company_has_cityService) {
        this.Company_has_cityService = Company_has_cityService;
    }

    // Endpoint de prueba para mañana empezar a expandir
    @GetMapping
    public List<Company_has_city> getAllCompany_has_city() {
        return Company_has_cityService.getAll();
    }
    @GetMapping("/{id}")
    public Company_has_city getById(@PathVariable Long id) {
        return Company_has_cityService.getById(id);
    }

    @PostMapping
    public Company_has_city create(@RequestBody Company_has_city body) {
        return Company_has_cityService.create(body);
    }

    @PutMapping("/{id}")
    public Company_has_city update(@PathVariable Long id, @RequestBody Company_has_city body) {
        return Company_has_cityService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Company_has_cityService.delete(id);
    }
    
}
