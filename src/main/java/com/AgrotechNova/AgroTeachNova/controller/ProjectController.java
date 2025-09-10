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
     @GetMapping("/{id}")
    public Project getById(@PathVariable Long id) {
        return ProjectService.getById(id);
    }

    @PostMapping
    public Project create(@RequestBody Project body) {
        return ProjectService.create(body);
    }

    @PutMapping("/{id}")
    public Project update(@PathVariable Long id, @RequestBody Project body) {
        return ProjectService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ProjectService.delete(id);
    }
}
