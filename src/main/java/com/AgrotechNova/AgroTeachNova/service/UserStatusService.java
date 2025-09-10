package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.UserStatus;
import com.AgrotechNova.AgroTeachNova.repository.UserStatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserStatusService {

    private final UserStatusRepository userStatusRepository;

    public UserStatusService(UserStatusRepository userStatusRepository) {
        this.userStatusRepository = userStatusRepository;
    }

    public List<UserStatus> getAll() {
        return userStatusRepository.findAll();
    }
    // Obtener por ID
    public UserStatus getById(Long id) {
        return userStatusRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("UserStatus not found with id: " + id));
    }

    // Crear nuevo
    public UserStatus create(UserStatus userStatus) {
        return userStatusRepository.save(userStatus);
    }

    // Actualizar existente
    public UserStatus update(Long id, UserStatus userStatus) {
        UserStatus existing = getById(id);
        // ⚠️ Ajusta estos setters según los atributos reales de tu entidad UserStatus
        existing.setName(userStatus.getName());
        existing.setDescription(userStatus.getDescription());
        return userStatusRepository.save(existing);
    }

    // Eliminar por ID
    public void delete(Long id) {
        userStatusRepository.deleteById(id);
    }
}
