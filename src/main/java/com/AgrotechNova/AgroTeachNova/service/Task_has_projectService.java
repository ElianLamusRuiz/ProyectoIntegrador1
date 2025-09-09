package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.Task_has_project;
import com.AgrotechNova.AgroTeachNova.repository.Task_has_projectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Task_has_projectService {

    private final Task_has_projectRepository task_Has_ProjectRepository;

    public Task_has_projectService(Task_has_projectRepository task_Has_ProjectRepository) {
        this.task_Has_ProjectRepository = task_Has_ProjectRepository;
    }

    public List<Task_has_project> getAll() {
        return task_Has_ProjectRepository.findAll();
    }
}
