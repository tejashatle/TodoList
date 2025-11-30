package com.example.learning.TodoList.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.learning.TodoList.entity.Todo;


public interface TodoService {
	
	public List<Todo> getTodoList();
	public Todo saveTodo(Todo todo);
	public Todo getTodo(long todoId);
	public Todo updateTodo(long todoId, Todo todo);
	public long deleteTodo(long todoId);
}
