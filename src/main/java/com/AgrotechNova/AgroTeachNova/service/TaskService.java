package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.Task;
import com.AgrotechNova.AgroTeachNova.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }
    // Obtener una tarea por ID
    public Task getById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
    }

    // Crear una nueva tarea
    public Task create(Task task) {
        return taskRepository.save(task);
    }

    // Actualizar una tarea existente
    public Task update(Long id, Task task) {
        Task existing = getById(id);
        // ⚠️ Ajusta los setters según los atributos reales de tu entidad Task
        existing.setName(task.getName());
        existing.setDescription(task.getDescription());
        existing.setStartDate(task.getStartDate());
        existing.setEndDate(task.getEndDate());
        existing.setStatus(task.getStatus());
        existing.setProject(task.getProject());
        return taskRepository.save(existing);
    }

    // Eliminar una tarea
    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}
