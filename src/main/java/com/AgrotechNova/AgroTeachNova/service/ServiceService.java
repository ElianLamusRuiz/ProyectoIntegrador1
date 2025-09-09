package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.repository.ServiceRepository;
import com.AgrotechNova.AgroTeachNova.Service;
import java.util.List;

/*
  Se evita importar org.springframework.stereotype.Service por conflicto de nombre
  con la entidad `Service`. Usamos la anotación con nombre totalmente calificado.
*/
@org.springframework.stereotype.Service
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<Service> getAll() {
        return serviceRepository.findAll();
    }
}
