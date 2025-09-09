package com.AgrotechNova.AgroTeachNova;

public class Task {
private int idtask;
private String description;


public Task() {
}

public Task(int idtask, String description) {
  this.idtask = idtask;
  this.description = description;
}

public int getIdTask() {
  return idtask;
}

public void setIdTask(int idtask) {
  this.idtask = idtask;
}

public String getDescription() {
  return description;
}

public void setDescription(String description) {
  this.description = description;
}

 public String toString() {
        return "Task{" +
                "idtask=" + idtask +
                ", description='" + description + '\'' +
                '}';
    }

}
