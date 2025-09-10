package com.AgrotechNova.AgroTeachNova.controller;

import com.AgrotechNova.AgroTeachNova.State;
import com.AgrotechNova.AgroTeachNova.service.StateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/state")
public class StateController {

    private final StateService stateService;

    public StateController(StateService stateService) {
        this.stateService = stateService;
    }

    @GetMapping
    public List<State> getAllState() {
        return stateService.getAll();
    }
     @GetMapping("/{id}")
    public State getById(@PathVariable Long id) {
        return stateService.getById(id);
    }

    @PostMapping
    public State create(@RequestBody State body) {
        return stateService.create(body);
    }

    @PutMapping("/{id}")
    public State update(@PathVariable Long id, @RequestBody State body) {
        return stateService.update(id, body);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        stateService.delete(id);
    }
}
