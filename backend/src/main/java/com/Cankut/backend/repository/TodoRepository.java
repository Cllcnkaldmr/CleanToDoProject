package com.Cankut.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Cankut.backend.model.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {

}