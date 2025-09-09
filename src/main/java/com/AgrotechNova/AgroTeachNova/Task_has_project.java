package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;
import java.util.Date;

public class Task_has_project {
    private int projectTaskid;
    private Task idtask;
    private Project idproject;
    private TaskStatus idtaskStatus;
    private Date startDate;
    private Date endDateExpectation;
    private Date endDate;

    public Task_has_project() {
    }

    public Task_has_project(int projectTaskid, Task idtask, Project idproject, TaskStatus idtaskStatus, Date startDate, Date endDateExpectation, Date endDate) {
        this.projectTaskid = projectTaskid;
        this.idtask = idtask;
        this.idproject = idproject;
        this.idtaskStatus = idtaskStatus;
        this.startDate = startDate;
        this.endDateExpectation = endDateExpectation;
        this.endDate = endDate;
    }

    public int getProjectTaskid() {
        return projectTaskid;
    }

    public void setProjectTaskid(int projectTaskid) {
        this.projectTaskid = projectTaskid;
    }

    public Task getIdtask() {
        return idtask;
    }

    public void setIdtask(Task idtask) {
        this.idtask = idtask;
    }

    public Project getIdproject() {
        return idproject;
    }

    public void setIdproject(Project idproject) {
        this.idproject = idproject;
    }

    public TaskStatus getIdtaskStatus() {
        return idtaskStatus;
    }

    public void setIdtaskStatus(TaskStatus idtaskStatus) {
        this.idtaskStatus = idtaskStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDateExpectation() {
        return endDateExpectation;
    }

    public void setEndDateExpectation(Date endDateExpectation) {
        this.endDateExpectation = endDateExpectation;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
