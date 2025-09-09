package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.CompanyType;
import com.AgrotechNova.AgroTeachNova.service.CompanyTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company-types") // 👈 Cambié la ruta para que tenga sentido
public class CompanyTypeController {

    private final CompanyTypeService companyTypeService; // 👈 nombre en minúscula

    public CompanyTypeController(CompanyTypeService companyTypeService) {
        this.companyTypeService = companyTypeService;
    }

    // Endpoint de prueba para mañana empezar a expandir
    @GetMapping
    public List<CompanyType> getAllCompanyType() {
        return companyTypeService.getAll(); // 👈 ahora sí correcto
    }
}