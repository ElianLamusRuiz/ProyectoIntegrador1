package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.TaskStatus;
import com.AgrotechNova.AgroTeachNova.repository.TaskStatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskStatusService {

    private final TaskStatusRepository taskStatusRepository;

    public TaskStatusService(TaskStatusRepository taskStatusRepository) {
        this.taskStatusRepository = taskStatusRepository;
    }

    public List<TaskStatus> getAll() {
        return taskStatusRepository.findAll();
    }
    // Obtener un estado de tarea por ID
    public TaskStatus getById(Long id) {
        return taskStatusRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TaskStatus not found with id: " + id));
    }

    // Crear un nuevo estado de tarea
    public TaskStatus create(TaskStatus taskStatus) {
        return taskStatusRepository.save(taskStatus);
    }

    // Actualizar un estado de tarea existente
    public TaskStatus update(Long id, TaskStatus taskStatus) {
        TaskStatus existing = getById(id);
        // ⚠️ Ajusta los setters según los atributos reales de tu entidad TaskStatus
        existing.setName(taskStatus.getName());
        existing.setDescription(taskStatus.getDescription());
        return taskStatusRepository.save(existing);
    }

    // Eliminar un estado de tarea
    public void delete(Long id) {
        taskStatusRepository.deleteById(id);
    }
}
