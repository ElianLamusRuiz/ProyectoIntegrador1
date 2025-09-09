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
}
