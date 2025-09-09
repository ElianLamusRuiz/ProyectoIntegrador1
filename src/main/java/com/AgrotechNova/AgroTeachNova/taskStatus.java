package com.AgrotechNova.AgroTeachNova;

import jakarta.persistence.*;



import jakarta.persistence.*;

public class TaskStatus {

  private int idtaskStatus;
  private String description;

  public TaskStatus() {
  }

  public TaskStatus(int idtaskStatus, String description) {
    this.idtaskStatus = idtaskStatus;
    this.description = description;
  }

  public int getIdtaskStatus() {
    return idtaskStatus;
  }

  public void setIdtaskStatus(int idtaskStatus) {
    this.idtaskStatus = idtaskStatus;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
