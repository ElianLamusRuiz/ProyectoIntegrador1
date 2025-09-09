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
}
