package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.TaskReport;
import com.AgrotechNova.AgroTeachNova.repository.TaskReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskReportService {

    private final TaskReportRepository taskReportRepository;

    public TaskReportService(TaskReportRepository taskReportRepository) {
        this.taskReportRepository = taskReportRepository;
    }

    public List<TaskReport> getAll() {
        return taskReportRepository.findAll();
    }
}
