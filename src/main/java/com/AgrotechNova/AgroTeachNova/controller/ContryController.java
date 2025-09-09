package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.Contry;
import com.AgrotechNova.AgroTeachNova.service.ContryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class ContryController {

    private final ContryService ContryService;

    public ContryController(ContryService ContryService) {
        this.ContryService = ContryService;
    }

    // Endpoint de prueba para mañana empezar a expandir
    @GetMapping
    public List<Contry> getAllContry() {
        return ContryService.getAllContry();
    }
}
