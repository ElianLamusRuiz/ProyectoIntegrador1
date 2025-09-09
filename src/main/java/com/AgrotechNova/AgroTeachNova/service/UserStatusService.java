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

    public List<UserStatus> getAllUserStatuses() {
        return userStatusRepository.findAll();
    }
}
