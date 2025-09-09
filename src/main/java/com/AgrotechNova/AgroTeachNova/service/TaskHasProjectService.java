package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.TaskHasProject;
import com.AgrotechNova.AgroTeachNova.repository.TaskHasProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskHasProjectService {

    private final TaskHasProjectRepository taskHasProjectRepository;

    public TaskHasProjectService(TaskHasProjectRepository taskHasProjectRepository) {
        this.taskHasProjectRepository = taskHasProjectRepository;
    }

    public List<TaskHasProject> getAllTaskHasProjects() {
        return taskHasProjectRepository.findAll();
    }
}
