package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;
import java.util.Date;

public class TaskReport {
    private int idtaskReport;
    private String title;
    private String description;
    private SysUser idsysuser;
    private Date reportDate;
    private Task_has_project projectTaskid;

    public TaskReport() {
    }

    public TaskReport(int idtaskReport, String title, String description, SysUser idsysuser, Date reportDate, Task_has_project projectTaskid) {
        this.idtaskReport = idtaskReport;
        this.title = title;
        this.description = description;
        this.idsysuser = idsysuser;
        this.reportDate = reportDate;
        this.projectTaskid = projectTaskid;
    }

    public int getIdtaskReport() {
        return idtaskReport;
    }

    public void setIdtaskReport(int idtaskReport) {
        this.idtaskReport = idtaskReport;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SysUser getIdsysuser() {
        return idsysuser;
    }

    public void setIdsysuser(SysUser idsysuser) {
        this.idsysuser = idsysuser;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Task_has_project getProjectTaskid() {
        return projectTaskid;
    }

    public void setProjectTaskid(Task_has_project projectTaskid) {
        this.projectTaskid = projectTaskid;
    }
}
