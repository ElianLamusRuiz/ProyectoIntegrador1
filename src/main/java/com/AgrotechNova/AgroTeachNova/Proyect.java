package com.AgrotechNova.AgroTeachNova;
import java.util.Date;

public class Project {
    private int idproject;
    private String description;
    private float cost;
    private Date startDate;
    private Date endDateExpectation;
    private Date endDate;
    private Service idservice;

    public Project() {
    }

    public Project(int idproject, String description, float cost, Date startDate, Date endDateExpectation, Date endDate, Service idservice) {
        this.idproject = idproject;
        this.description = description;
        this.cost = cost;
        this.startDate = startDate;
        this.endDateExpectation = endDateExpectation;
        this.endDate = endDate;
        this.idservice = idservice;
    }

    public int getIdproject() {
        return idproject;
    }

    public void setIdproject(int idproject) {
        this.idproject = idproject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
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

    public Service getIdservice() {
        return idservice;
    }

    public void setIdservice(Service idservice) {
        this.idservice = idservice;
    }
}
