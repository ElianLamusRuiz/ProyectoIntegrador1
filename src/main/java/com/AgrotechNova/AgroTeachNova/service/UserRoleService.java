package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.UserRole;
import com.AgrotechNova.AgroTeachNova.repository.UserRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {

    private final UserRoleRepository userRoleRepository;

    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public List<UserRole> getAll() {
        return userRoleRepository.findAll();
    }
    // Obtener por ID
    public UserRole getById(Long id) {
        return userRoleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("UserRole not found with id: " + id));
    }

    // Crear nuevo
    public UserRole create(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    // Actualizar existente
    public UserRole update(Long id, UserRole userRole) {
        UserRole existing = getById(id);
        // ⚠️ Ajusta estos setters según los atributos reales de tu entidad UserRole
        existing.setName(userRole.getName());
        existing.setDescription(userRole.getDescription());
        return userRoleRepository.save(existing);
    }

    // Eliminar por ID
    public void delete(Long id) {
        userRoleRepository.deleteById(id);
    }
}
