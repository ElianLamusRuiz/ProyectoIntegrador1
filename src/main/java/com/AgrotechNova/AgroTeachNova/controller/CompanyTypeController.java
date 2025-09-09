package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.CompanyType;
import com.AgrotechNova.AgroTeachNova.service.CompanyTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class CompanyTypeController {

    private final CompanyTypeService CompanyTypeService;

    public CompanyTypeController(CompanyTypeService CompanyTypeService) {
        this.CompanyTypeService = CompanyTypeService;
    }

    // Endpoint de prueba para mañana empezar a expandir
    @GetMapping
    public List<CompanyType> getAllCompanyType() {
        return CompanyTypeService.getAllCompanyType();
    }
}
