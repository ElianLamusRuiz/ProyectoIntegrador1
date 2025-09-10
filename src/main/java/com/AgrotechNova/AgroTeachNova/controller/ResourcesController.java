package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.Resources;
import com.AgrotechNova.AgroTeachNova.service.ResourcesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourcesController {

    private final ResourcesService resourcesService;

    public ResourcesController(ResourcesService resourcesService) {
        this.resourcesService = resourcesService;
    }

    @GetMapping
    public List<Resources> getAllResources() {
        return resourcesService.getAll();
    }
     @GetMapping("/{id}")
    public Resources getById(@PathVariable Long id) {
        return resourcesService.getById(id);
    }

    @PostMapping
    public Resources create(@RequestBody Resources body) {
        return resourcesService.create(body);
    }

    @PutMapping("/{id}")
    public Resources update(@PathVariable Long id, @RequestBody Resources body) {
        return resourcesService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        resourcesService.delete(id);
    }
}
