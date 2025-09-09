package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.Company;
import com.AgrotechNova.AgroTeachNova.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies") // 👈 Ruta corregida
public class CompanyController {

    private final CompanyService companyService; // 👈 en minúscula

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    // Endpoint de prueba para mañana empezar a expandir
    @GetMapping
    public List<Company> getAllCompany() {
        return companyService.getAll(); // 👈 uso correcto
    }
}