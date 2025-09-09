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

    public List<ResourceType> getAllResourceTypes() {
        return resourceTypeRepository.findAll();
    }
}
