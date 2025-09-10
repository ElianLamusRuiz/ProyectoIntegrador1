package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.ServiceType;
import com.AgrotechNova.AgroTeachNova.repository.ServiceTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeService {

    private final ServiceTypeRepository serviceTypeRepository;

    public ServiceTypeService(ServiceTypeRepository serviceTypeRepository) {
        this.serviceTypeRepository = serviceTypeRepository;
    }

    public List<ServiceType> getAll() {
        return serviceTypeRepository.findAll();
    }
    public ServiceType getById(Long id) {
        return serviceTypeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ServiceType not found"));
    }

    public ServiceType create(ServiceType serviceType) {
        return serviceTypeRepository.save(serviceType);
    }

    public ServiceType update(Long id, ServiceType serviceType) {
        ServiceType existing = getById(id);
        // Ajusta estos setters según los campos reales de tu entidad ServiceType
        existing.setName(serviceType.getName());
        existing.setDescription(serviceType.getDescription());
        return serviceTypeRepository.save(existing);
    }

    public void delete(Long id) {
        serviceTypeRepository.deleteById(id);
    }
}
