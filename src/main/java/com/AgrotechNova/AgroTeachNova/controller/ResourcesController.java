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
}
