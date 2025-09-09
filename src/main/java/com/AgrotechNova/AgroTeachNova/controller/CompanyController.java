package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.Company;
import com.AgrotechNova.AgroTeachNova.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class CompanyController {

    private final CompanyService CompanyService;

    public CompanyController(CompanyService CompanyService) {
        this.CompanyService = CompanyService;
    }

    // Endpoint de prueba para mañana empezar a expandir
    @GetMapping
    public List<Company> getAllCompany() {
        return CompanyService.getAllCompany();
    }
}
