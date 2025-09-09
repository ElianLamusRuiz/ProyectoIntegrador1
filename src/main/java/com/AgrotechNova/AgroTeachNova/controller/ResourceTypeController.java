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
}
