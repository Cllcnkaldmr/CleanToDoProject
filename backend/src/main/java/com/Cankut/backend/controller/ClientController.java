package com.Cankut.backend.controller;

import com.Cankut.backend.model.Todo;
import com.Cankut.backend.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ClientController {
    // service
    @Autowired
    private TodoService todoService;

    @RequestMapping("/")
    public String hello_world(){
        return "Hello World";
    }

    // add Todo
    @PostMapping("/add")
    public String addTodo(@RequestBody Todo todo){
        todoService.addTodo(todo);
        return "Added Successfully..";
    }

    // getTodoById
    @RequestMapping("/todo/{id}")
    public Todo getTodoById(@PathVariable("id") int id){
        return todoService.getTodoById(id);
    }

    // getTodos
    @RequestMapping("/todos")
    public List<Todo> getTodos(){
        return todoService.getTodos();
    }
    
    // updateTodos
    @PutMapping("/todo")
    public Todo updateTodo(@RequestBody Todo todo){
        return todoService.updateTodo(todo);
    }
    
    // deleteTodoById
    @DeleteMapping("/todo/{id}")
    public String deleteTodo(@PathVariable("id") int id){
        todoService.deleteTodo(id);
        return "Todo Deleted";
    }

}