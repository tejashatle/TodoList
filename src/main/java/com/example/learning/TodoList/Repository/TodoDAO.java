package com.example.learning.TodoList.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.learning.TodoList.entity.Todo;


public interface TodoDAO {
	public List<Todo> getTodoList();
	
	public Todo saveTodo(Todo todo);
	
	public Todo getTodo(long todoId);
	
	public Todo updateTodo(long todoId, Todo todo);
	
}
