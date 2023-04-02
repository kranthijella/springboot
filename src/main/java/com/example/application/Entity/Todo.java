package com.example.application.Entity;

import jakarta.persistence.*;


@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    private String taskname;
    private boolean status = true;

    private String description;

    public Todo() {

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setName(String taskname) {
        this.taskname = taskname;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Todo(String description, String taskname, boolean status) {
        this.description = description;
        this.taskname = taskname;
        this.status = status;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return taskname;
    }


    public String getDescription() {
        return description;
    }

    public boolean isStatus() {
        return status;
    }

    public String getTaskname() {
        return taskname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + taskname + '\'' +
                ", age='" + description + '\'' +
                '}';
    }
}
