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
    public TaskReport getById(Long id) {
        return taskReportRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TaskReport not found with id: " + id));
    }

    // Crear un nuevo reporte
    public TaskReport create(TaskReport taskReport) {
        return taskReportRepository.save(taskReport);
    }

    // Actualizar un reporte existente
    public TaskReport update(Long id, TaskReport taskReport) {
        TaskReport existing = getById(id);
        // Ajusta estos setters según los atributos reales de tu entidad TaskReport
        existing.setDescription(taskReport.getDescription());
        existing.setStatus(taskReport.getStatus());
        existing.setCreatedAt(taskReport.getCreatedAt());
        existing.setUpdatedAt(taskReport.getUpdatedAt());
        existing.setTask(taskReport.getTask());
        existing.setSysUser(taskReport.getSysUser());
        return taskReportRepository.save(existing);
    }

    // Eliminar un reporte
    public void delete(Long id) {
        taskReportRepository.deleteById(id);
    }
}
