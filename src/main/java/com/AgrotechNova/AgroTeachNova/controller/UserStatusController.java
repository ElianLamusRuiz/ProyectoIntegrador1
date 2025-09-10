package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.UserStatus;
import com.AgrotechNova.AgroTeachNova.service.UserStatusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user_status")
public class UserStatusController {

    private final UserStatusService userStatusService;

    public UserStatusController(UserStatusService userStatusService) {
        this.userStatusService = userStatusService;
    }

    @GetMapping
    public List<UserStatus> getAllUserStatus() {
        return userStatusService.getAll();
    }
     @GetMapping("/{id}")
    public UserStatus getById(@PathVariable Long id) {
        return userStatusService.getById(id);
    }

    @PostMapping
    public UserStatus create(@RequestBody UserStatus body) {
        return userStatusService.create(body);
    }

    @PutMapping("/{id}")
    public UserStatus update(@PathVariable Long id, @RequestBody UserStatus body) {
        return userStatusService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userStatusService.delete(id);
    }
}
