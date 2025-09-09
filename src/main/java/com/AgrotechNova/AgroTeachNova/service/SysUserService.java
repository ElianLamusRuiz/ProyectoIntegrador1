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

    // Aquí mañana implementar los métodos: findAll, create, delete, etc.
    public List<SysUser> getAllUsers() {
        return sysUserRepository.findAll();
    }
}
