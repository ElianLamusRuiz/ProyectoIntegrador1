package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.Resources;
import com.AgrotechNova.AgroTeachNova.repository.ResourcesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourcesService {

    private final ResourcesRepository resourcesRepository;

    public ResourcesService(ResourcesRepository resourcesRepository) {
        this.resourcesRepository = resourcesRepository;
    }

    public List<Resources> getAll() {
        return resourcesRepository.findAll();
    }
    public Resources getById(Long id) {
        return resourcesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resource not found"));
    }

    public Resources create(Resources resources) {
        return resourcesRepository.save(resources);
    }

    public Resources update(Long id, Resources resources) {
        Resources existing = getById(id);
        // Ajusta estos setters según los campos reales de tu entidad Resources
        existing.setName(resources.getName());
        existing.setDescription(resources.getDescription());
        existing.setQuantity(resources.getQuantity());
        existing.setType(resources.getType());
        return resourcesRepository.save(existing);
    }

    public void delete(Long id) {
        resourcesRepository.deleteById(id);
    }
}
