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
    public State getById(Long id) {
        return stateRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("State not found"));
    }

    public State create(State state) {
        return stateRepository.save(state);
    }

    public State update(Long id, State state) {
        State existing = getById(id);
        // Ajusta estos setters según los atributos reales de tu entidad State
        existing.setName(state.getName());
        existing.setCode(state.getCode());
        existing.setCountry(state.getCountry());
        return stateRepository.save(existing);
    }

    public void delete(Long id) {
        stateRepository.deleteById(id);
    }
}
