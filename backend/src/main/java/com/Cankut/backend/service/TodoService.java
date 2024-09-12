package com.Cankut.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Cankut.backend.model.Todo;

@Service
public interface TodoService {
    public Todo addTodo(Todo todo);
    public Todo getTodoById(int id);
    public List<Todo> getTodos();
    public void deleteTodo(int id);
    public Todo updateTodo(Todo todo);

}