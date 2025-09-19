package com.todo.todoapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.todoapp.models.TodoModel;

@Service
public class TodoService {

    // In-memory list to store todos temporarily
    private List<TodoModel> list = new ArrayList<>();

    // Method to create a new todo
    public TodoModel createTodo(TodoModel todo) {
        list.add(todo);
        return todo;
    }

    // Method to get all todos
    public List<TodoModel> getList() {
        return list;
    }

    // PUT: Update a todo
    public TodoModel updateTodo(TodoModel todo) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(todo.getId())) {
                list.set(i, todo);
                return todo;
            }
        }
        return null;
    }

    // DELETE: remove a todo by ID
    public void deleteTodo(long id) {
        String idStr = String.valueOf(id);
        list.removeIf(t -> t.getId().equals(idStr));
    }

    public List<TodoModel> createBulkTodos(List<TodoModel> todos) {
        list.addAll(todos);
        return todos;
    }

    // Method to update multiple todos in bulk
    public List<TodoModel> updateBulkTodos(List<TodoModel> todos) {
        for (TodoModel todo : todos) {
            updateTodo(todo); // Reusing the single update method
        }
        return todos;
    }

    // Method to delete multiple todos in bulk by their IDs
    public void deleteBulkTodos(List<String> ids) {
        list.removeIf(todo -> ids.contains(todo.getId()));
    }
}
