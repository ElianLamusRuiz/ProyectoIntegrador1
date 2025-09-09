package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.SysUser;
import com.AgrotechNova.AgroTeachNova.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class SysUserController {

    private final SysUserService sysUserService;

    public SysUserController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    // Endpoint de prueba para mañana empezar a expandir
    @GetMapping
    public List<SysUser> getAllUsers() {
        return sysUserService.getAllUsers();
    }
}
