package com.todo.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.todoapp.models.TodoModel;

public interface TodoRepository extends JpaRepository<TodoModel,String> {

    
}

