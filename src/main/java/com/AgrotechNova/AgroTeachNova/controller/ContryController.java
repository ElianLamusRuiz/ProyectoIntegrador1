package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.Country;
import com.AgrotechNova.AgroTeachNova.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class ContryController {

    private final CountryService ContryService;

    public ContryController(CountryService ContryService) {
        this.ContryService = ContryService;
    }

    // Endpoint de prueba para mañana empezar a expandir
    @GetMapping
    public List<Country> getAllContry() {
        return ContryService.getAll();
    }
}
