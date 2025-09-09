package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.Project_has_resources;
import com.AgrotechNova.AgroTeachNova.service.Project_has_resourcesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project_has_resources")
public class Project_has_resourcesController {

    private final Project_has_resourcesService project_has_resourcesService;

    public Project_has_resourcesController(Project_has_resourcesService project_has_resourcesService) {
        this.project_has_resourcesService = project_has_resourcesService;
    }

    @GetMapping
    public List<Project_has_resources> getAllProject_has_resources() {
        return project_has_resourcesService.getAll();
    }
}
