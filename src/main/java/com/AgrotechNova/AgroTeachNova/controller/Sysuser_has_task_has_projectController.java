package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.Sysuser_has_task_has_project;
import com.AgrotechNova.AgroTeachNova.service.Sysuser_has_task_has_projectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sysuser_has_task_has_project")
public class Sysuser_has_task_has_projectController {

    private final Sysuser_has_task_has_projectService sysuser_has_task_has_projectService;

    public Sysuser_has_task_has_projectController(Sysuser_has_task_has_projectService sysuser_has_task_has_projectService) {
        this.sysuser_has_task_has_projectService = sysuser_has_task_has_projectService;
    }

    @GetMapping
    public List<Sysuser_has_task_has_project> getAllSysuser_has_task_has_project() {
        return sysuser_has_task_has_projectService.getAll();
    }
}
