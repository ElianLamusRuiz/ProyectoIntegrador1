package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.ResourceType;
import com.AgrotechNova.AgroTeachNova.service.ResourceTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resource_type")
public class ResourceTypeController {

    private final ResourceTypeService resourceTypeService;

    public ResourceTypeController(ResourceTypeService resourceTypeService) {
        this.resourceTypeService = resourceTypeService;
    }

    @GetMapping
    public List<ResourceType> getAllResourceType() {
        return resourceTypeService.getAll();
    }
    @GetMapping("/{id}")
    public ResourceType getById(@PathVariable Long id) {
        return resourceTypeService.getById(id);
    }

    @PostMapping
    public ResourceType create(@RequestBody ResourceType body) {
        return resourceTypeService.create(body);
    }

    @PutMapping("/{id}")
    public ResourceType update(@PathVariable Long id, @RequestBody ResourceType body) {
        return resourceTypeService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        resourceTypeService.delete(id);
    }
}
