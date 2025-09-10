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
    public Sysuser_has_task_has_project getById(Long id) {
        return sysuser_Has_Task_Has_ProjectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sysuser_has_task_has_project not found"));
    }

    public Sysuser_has_task_has_project create(Sysuser_has_task_has_project relation) {
        return sysuser_Has_Task_Has_ProjectRepository.save(relation);
    }

    public Sysuser_has_task_has_project update(Long id, Sysuser_has_task_has_project relation) {
        Sysuser_has_task_has_project existing = getById(id);
        // Ajusta estos setters según los atributos reales de tu entidad Sysuser_has_task_has_project
        existing.setSysUser(relation.getSysUser());
        existing.setTask(relation.getTask());
        existing.setProject(relation.getProject());
        existing.setRole(relation.getRole());
        return sysuser_Has_Task_Has_ProjectRepository.save(existing);
    }

    public void delete(Long id) {
        sysuser_Has_Task_Has_ProjectRepository.deleteById(id);
    }
}
