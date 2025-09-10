package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.TaskReport;
import com.AgrotechNova.AgroTeachNova.service.TaskReportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task_report")
public class TaskReportController {

    private final TaskReportService taskReportService;

    public TaskReportController(TaskReportService taskReportService) {
        this.taskReportService = taskReportService;
    }

    @GetMapping
    public List<TaskReport> getAllTaskReport() {
        return taskReportService.getAll();
    }
    @GetMapping("/{id}")
    public TaskReport getById(@PathVariable Long id) {
        return taskReportService.getById(id);
    }

    @PostMapping
    public TaskReport create(@RequestBody TaskReport body) {
        return taskReportService.create(body);
    }

    @PutMapping("/{id}")
    public TaskReport update(@PathVariable Long id, @RequestBody TaskReport body) {
        return taskReportService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        taskReportService.delete(id);
    }
}
