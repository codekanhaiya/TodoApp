package com.todo.todoapp.services;

// import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.todoapp.models.TodoModel;
import com.todo.todoapp.repository.TodoRepository;

@Service
public class TodoService {

    // In-memory list to store todos temporarily
    // private List<TodoModel> list = new ArrayList<>();

    @Autowired
    private TodoRepository todoRepository;

    // Method to create a new todo
    public TodoModel createTodo(TodoModel todo) {
        // list.add(todo);
        // return todo;
        return todoRepository.save(todo);
    }

    // Method to get all todos
    public List<TodoModel> getList() {
        // return list;
        return todoRepository.findAll();
    }

    // PUT: Update a todo
    public TodoModel updateTodo(TodoModel todo) {
        // for (int i = 0; i < list.size(); i++) {
        // if (list.get(i).getId().equals(todo.getId())) {
        // list.set(i, todo);
        // return todo;
        // }
        // }
        // return null;
        return todoRepository.save(todo);
    }

    // DELETE: remove a todo by ID
    public void deleteTodo(String id) {
        // list.removeIf(t -> t.getId().equals(id));
        todoRepository.deleteById(id);
    }

    public List<TodoModel> createBulkTodos(List<TodoModel> todos) {
        // list.addAll(todos);
        // return todos;
        return todoRepository.saveAll(todos);
    }

    // Method to update multiple todos in bulk
    public List<TodoModel> updateBulkTodos(List<TodoModel> todos) {
        // for (TodoModel todo : todos) {
        // updateTodo(todo); // Reusing the single update method
        // }
        // return todos;
        return todoRepository.saveAll(todos);
    }

    // Method to delete multiple todos in bulk by their IDs
    public void deleteBulkTodos(List<String> ids) {
        // list.removeIf(todo -> ids.contains(todo.getId()));
        ids.forEach(todoRepository::deleteById);
    }
}
