package com.Cankut.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="todo")
public class Todo {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "task")
    private String task;

    @Column(name = "details")
    private String details;


    public String getTask() {
        return task;
    }
    

    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setTask(String task) {
        this.task = task;
    }

    public String getDetails() {
        return details;
    }

    

}
