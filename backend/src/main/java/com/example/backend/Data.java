package com.example.backend;

public class Data {

    private int id;
    private String description;
    private StatusToDo status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusToDo getStatus() {
        return status;
    }

    public void setStatus(StatusToDo status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
