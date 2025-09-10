package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.SysUser;
import com.AgrotechNova.AgroTeachNova.repository.SysUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {

    private final SysUserRepository sysUserRepository;

    public SysUserService(SysUserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }

    // Aquí mañana implementarás los métodos: findAll, create, delete, etc.
    public List<SysUser> getAllUsers() {
        return sysUserRepository.findAll();
    }
    public SysUser getById(Long id) {
        return sysUserRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public SysUser create(SysUser user) {
        return sysUserRepository.save(user);
    }

    public SysUser update(Long id, SysUser user) {
        SysUser existing = getById(id);
        // Ajusta estos setters según los atributos reales de tu entidad SysUser
        existing.setUsername(user.getUsername());
        existing.setPassword(user.getPassword());
        existing.setEmail(user.getEmail());
        existing.setRole(user.getRole());
        return sysUserRepository.save(existing);
    }

    public void delete(Long id) {
        sysUserRepository.deleteById(id);
    }
}
