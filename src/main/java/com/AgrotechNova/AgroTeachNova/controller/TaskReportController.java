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
}
