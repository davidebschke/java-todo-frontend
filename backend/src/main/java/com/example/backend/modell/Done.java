package com.example.backend.modell;

public class Done {

    String id;
    String taskName;
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Done{" +
                "taskId='" + id + '\'' +
                ", taskName='" + taskName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

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

    public Done(String id, String taskName) {
        this.id = id;
        this.taskName = taskName;
    }
}
