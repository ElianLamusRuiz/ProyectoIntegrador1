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
    public Project_has_resources getById(Long id) {
        return project_Has_ResourcesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project_has_resources not found"));
    }

    public Project_has_resources create(Project_has_resources projectHasResources) {
        return project_Has_ResourcesRepository.save(projectHasResources);
    }

    public Project_has_resources update(Long id, Project_has_resources projectHasResources) {
        Project_has_resources existing = getById(id);
        // Ajusta según los campos reales de tu entidad Project_has_resources
        existing.setProject(projectHasResources.getProject());
        existing.setResource(projectHasResources.getResource());
        existing.setQuantity(projectHasResources.getQuantity());
        return project_Has_ResourcesRepository.save(existing);
    }

    public void delete(Long id) {
        project_Has_ResourcesRepository.deleteById(id);
    }
}
