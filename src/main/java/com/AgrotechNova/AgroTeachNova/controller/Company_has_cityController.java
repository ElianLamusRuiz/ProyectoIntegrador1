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
}
