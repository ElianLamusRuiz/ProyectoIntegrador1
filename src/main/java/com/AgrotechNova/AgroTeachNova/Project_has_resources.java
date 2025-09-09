package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class Project_has_resources {
    private Project idproject;
    private Resources idresources;

    public Project_has_resources() {
    }

    public Project_has_resources(Project idproject, Resources idresources) {
        this.idproject = idproject;
        this.idresources = idresources;
    }

    public Project getIdproject() {
        return idproject;
    }

    public void setIdproject(Project idproject) {
        this.idproject = idproject;
    }

    public Resources getIdresources() {
        return idresources;
    }

    public void setIdresources(Resources idresources) {
        this.idresources = idresources;
    }
}
