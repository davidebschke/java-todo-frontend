package com.example.backend.modell;

public class Doing {

    String id;
    String taskName;
    String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Doing{" +
                "taskId='" + id + '\'' +
                ", taskName='" + taskName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Doing(String id, String taskName, String status) {
        this.id = id;
        this.taskName = taskName;
        this.status = status;
    }
}
