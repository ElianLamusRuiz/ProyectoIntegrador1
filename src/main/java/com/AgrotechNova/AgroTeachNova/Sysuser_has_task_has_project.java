package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class Sysuser_has_task_has_project {

    private int sysuser_idsysuser;
    private int task_has_project_projectTaskid;

    public Sysuser_has_task_has_project() {
    }

    public Sysuser_has_task_has_project(int sysuser_idsysuser, int task_has_project_projectTaskid) {
        this.sysuser_idsysuser = sysuser_idsysuser;
        this.task_has_project_projectTaskid = task_has_project_projectTaskid;
    }

    public int getSysuser_idsysuser() {
        return sysuser_idsysuser;
    }

    public void setSysuser_idsysuser(int sysuser_idsysuser) {
        this.sysuser_idsysuser = sysuser_idsysuser;
    }

    public int getTask_has_project_projectTaskid() {
        return task_has_project_projectTaskid;
    }

    public void setTask_has_project_projectTaskid(int task_has_project_projectTaskid) {
        this.task_has_project_projectTaskid = task_has_project_projectTaskid;
    }
}
