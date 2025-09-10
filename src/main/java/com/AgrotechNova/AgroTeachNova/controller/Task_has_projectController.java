package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.Task_has_project;
import com.AgrotechNova.AgroTeachNova.service.Task_has_projectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task_has_project")
public class Task_has_projectController {

    private final Task_has_projectService task_has_projectService;

    public Task_has_projectController(Task_has_projectService task_has_projectService) {
        this.task_has_projectService = task_has_projectService;
    }

    @GetMapping
    public List<Task_has_project> getAllTask_has_project() {
        return task_has_projectService.getAll();
    }
     @GetMapping("/{id}")
    public Task_has_project getById(@PathVariable Long id) {
        return task_has_projectService.getById(id);
    }

    @PostMapping
    public Task_has_project create(@RequestBody Task_has_project body) {
        return task_has_projectService.create(body);
    }

    @PutMapping("/{id}")
    public Task_has_project update(@PathVariable Long id, @RequestBody Task_has_project body) {
        return task_has_projectService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        task_has_projectService.delete(id);
    }
}
