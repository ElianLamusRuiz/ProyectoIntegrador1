package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;

public class Service {
    private int idservice;
    private String serviceName;
    private String description;
    private ServiceType idserviceType;
    private Company idcompany;

    public Service() {
    }

    public Service(int idservice, String serviceName, String description, ServiceType idserviceType, Company idcompany) {
        this.idservice = idservice;
        this.serviceName = serviceName;
        this.description = description;
        this.idserviceType = idserviceType;
        this.idcompany = idcompany;
    }

    public int getIdservice() {
        return idservice;
    }

    public void setIdservice(int idservice) {
        this.idservice = idservice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceType getIdserviceType() {
        return idserviceType;
    }

    public void setIdserviceType(ServiceType idserviceType) {
        this.idserviceType = idserviceType;
    }

    public Company getIdcompany() {
        return idcompany;
    }

    public void setIdcompany(Company idcompany) {
        this.idcompany = idcompany;
    }
}
