package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.TaskStatus;
import com.AgrotechNova.AgroTeachNova.service.TaskStatusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task_status")
public class TaskStatusController {

    private final TaskStatusService taskStatusService;

    public TaskStatusController(TaskStatusService taskStatusService) {
        this.taskStatusService = taskStatusService;
    }

    @GetMapping
    public List<TaskStatus> getAllTaskStatus() {
        return taskStatusService.getAll();
    }
     @GetMapping("/{id}")
    public TaskStatus getById(@PathVariable Long id) {
        return taskStatusService.getById(id);
    }

    @PostMapping
    public TaskStatus create(@RequestBody TaskStatus body) {
        return taskStatusService.create(body);
    }

    @PutMapping("/{id}")
    public TaskStatus update(@PathVariable Long id, @RequestBody TaskStatus body) {
        return taskStatusService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        taskStatusService.delete(id);
    }
}
