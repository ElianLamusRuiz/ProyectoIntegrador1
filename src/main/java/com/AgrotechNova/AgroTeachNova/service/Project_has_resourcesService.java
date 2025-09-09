package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.Project_has_resources;
import com.AgrotechNova.AgroTeachNova.repository.Project_has_resourcesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Project_has_resourcesService {

    private final Project_has_resourcesRepository project_Has_ResourcesRepository;

    public Project_has_resourcesService(Project_has_resourcesRepository project_Has_ResourcesRepository) {
        this.project_Has_ResourcesRepository = project_Has_ResourcesRepository;
    }

    public List<Project_has_resources> getAll() {
        return project_Has_ResourcesRepository.findAll();
    }
}
