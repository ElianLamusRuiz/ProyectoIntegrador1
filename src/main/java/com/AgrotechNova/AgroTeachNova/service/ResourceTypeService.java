package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.ResourceType;
import com.AgrotechNova.AgroTeachNova.repository.ResourceTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceTypeService {

    private final ResourceTypeRepository resourceTypeRepository;

    public ResourceTypeService(ResourceTypeRepository resourceTypeRepository) {
        this.resourceTypeRepository = resourceTypeRepository;
    }

    public List<ResourceType> getAll() {
        return resourceTypeRepository.findAll();
    }
    public ResourceType getById(Long id) {
        return resourceTypeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ResourceType not found"));
    }

    public ResourceType create(ResourceType resourceType) {
        return resourceTypeRepository.save(resourceType);
    }

    public ResourceType update(Long id, ResourceType resourceType) {
        ResourceType existing = getById(id);
        // Ajusta estos setters según los campos reales de tu entidad ResourceType
        existing.setName(resourceType.getName());
        existing.setDescription(resourceType.getDescription());
        return resourceTypeRepository.save(existing);
    }

    public void delete(Long id) {
        resourceTypeRepository.deleteById(id);
    }
}
