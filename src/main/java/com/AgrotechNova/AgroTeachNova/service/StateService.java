package com.AgrotechNova.AgroTeachNova.service;

import com.AgrotechNova.AgroTeachNova.State;
import com.AgrotechNova.AgroTeachNova.repository.StateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    private final StateRepository stateRepository;

    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    public List<State> getAll() {
        return stateRepository.findAll();
    }
}
