package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.Project;
import com.AgrotechNova.AgroTeachNova.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class ProjectController {

    private final ProjectService ProjectService;

    public ProjectController(ProjectService ProjectService) {
        this.ProjectService = ProjectService;
    }

    // Endpoint de prueba para mañana empezar a expandir
    @GetMapping
    public List<Project> getAllProject() {
        return ProjectService.getAll();
    }
}
