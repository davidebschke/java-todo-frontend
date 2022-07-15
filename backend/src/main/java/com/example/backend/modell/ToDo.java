package com.example.backend.modell;

public class ToDo {

    String id;
    String taskName;
    String status;

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "taskId='" + id + '\'' +
                ", taskName='" + taskName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ToDo(String id, String taskName) {
        this.id = id;
        this.taskName = taskName;
        this.status=    status;
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
}
