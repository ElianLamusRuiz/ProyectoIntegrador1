package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.Sysuser_has_task_has_project;
import com.AgrotechNova.AgroTeachNova.repository.Sysuser_has_task_has_projectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sysuser_has_task_has_projectService {

    private final Sysuser_has_task_has_projectRepository sysuser_Has_Task_Has_ProjectRepository;

    public Sysuser_has_task_has_projectService(Sysuser_has_task_has_projectRepository sysuser_Has_Task_Has_ProjectRepository) {
        this.sysuser_Has_Task_Has_ProjectRepository = sysuser_Has_Task_Has_ProjectRepository;
    }

    public List<Sysuser_has_task_has_project> getAll() {
        return sysuser_Has_Task_Has_ProjectRepository.findAll();
    }
}
