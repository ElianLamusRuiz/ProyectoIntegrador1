package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class ResourceType {
    private int idresourceType;
    private String name;
    private String description;

    public ResourceType() {
    }

    public ResourceType(int idresourceType, String name, String description) {
        this.idresourceType = idresourceType;
        this.name = name;
        this.description = description;
    }

    public int getIdresourceType() {
        return idresourceType;
    }

    public void setIdresourceType(int idresourceType) {
        this.idresourceType = idresourceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
