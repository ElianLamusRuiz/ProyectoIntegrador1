package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.ServiceType;
import com.AgrotechNova.AgroTeachNova.service.ServiceTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service_type")
public class ServiceTypeController {

    private final ServiceTypeService serviceTypeService;

    public ServiceTypeController(ServiceTypeService serviceTypeService) {
        this.serviceTypeService = serviceTypeService;
    }

    @GetMapping
    public List<ServiceType> getAllServiceType() {
        return serviceTypeService.getAll();
    }
    @GetMapping("/{id}")
    public ServiceType getById(@PathVariable Long id) {
        return serviceTypeService.getById(id);
    }

    @PostMapping
    public ServiceType create(@RequestBody ServiceType body) {
        return serviceTypeService.create(body);
    }

    @PutMapping("/{id}")
    public ServiceType update(@PathVariable Long id, @RequestBody ServiceType body) {
        return serviceTypeService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        serviceTypeService.delete(id);
    }
}
