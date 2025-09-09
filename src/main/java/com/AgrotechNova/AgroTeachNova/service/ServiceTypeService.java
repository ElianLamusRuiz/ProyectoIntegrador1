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
}
