package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.Service;
import com.AgrotechNova.AgroTeachNova.service.ServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service")
public class ServiceController {

    private final ServiceService serviceService;

    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping
    public List<Service> getAllService() {
        return serviceService.getAll();
    }
    @GetMapping("/{id}")
    public Service getById(@PathVariable Long id) {
        return serviceService.getById(id);
    }

    @PostMapping
    public Service create(@RequestBody Service body) {
        return serviceService.create(body);
    }

    @PutMapping("/{id}")
    public Service update(@PathVariable Long id, @RequestBody Service body) {
        return serviceService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        serviceService.delete(id);
    }
}
