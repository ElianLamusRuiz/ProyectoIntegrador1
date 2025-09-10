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
  public Service getById(Long id) {
        return serviceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Service not found"));
    }

    public Service create(Service service) {
        return serviceRepository.save(service);
    }

    public Service update(Long id, Service service) {
        Service existing = getById(id);
        // Ajusta estos setters según los atributos reales de tu entidad Service
        existing.setName(service.getName());
        existing.setDescription(service.getDescription());
        existing.setPrice(service.getPrice());
        return serviceRepository.save(existing);
    }

    public void delete(Long id) {
        serviceRepository.deleteById(id);
    }
}
