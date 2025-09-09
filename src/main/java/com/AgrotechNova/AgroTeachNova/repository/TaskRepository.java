package com.AgrotechNova.AgroTeachNova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.AgrotechNova.AgroTeachNova.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
