package com.AgrotechNova.AgroTeachNova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.AgrotechNova.AgroTeachNova.TaskStatus;

public interface TaskStatusRepository extends JpaRepository<TaskStatus,Long> {

}
