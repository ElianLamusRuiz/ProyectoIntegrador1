
package com.AgrotechNova.AgroTeachNova;

public class taskStatus {
  private int idtaskStatus;
  private String description;

  public taskStatus() {
  }

  public taskStatus(int idtaskStatus, String description) {
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