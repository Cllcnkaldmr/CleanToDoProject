package com.Cankut.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cankut.backend.model.Todo;
import com.Cankut.backend.repository.TodoRepository;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    // repository
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo getTodoById(int id) {
        return todoRepository.findById(id).get();
    }

    @Override
    public List<Todo> getTodos() {
        return (List<Todo>) todoRepository.findAll();
    }

    @Override
    public void deleteTodo(int id) {
        todoRepository.deleteById(id);
    }

	@Override
	public Todo updateTodo(Todo todo) {
		return todoRepository.save(todo);
		
	}


}


