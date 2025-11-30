package com.example.learning.TodoList.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learning.TodoList.Repository.TodoDAO;
import com.example.learning.TodoList.entity.Todo;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	private TodoDAO todoDAO;

	@Override
	public List<Todo> getTodoList() {
		return todoDAO.getTodoList();
	}

	@Override
	public Todo saveTodo(Todo todo) {
		return todoDAO.saveTodo(todo);
	}

	@Override
	public Todo getTodo(long todoId) {
		return todoDAO.getTodo(todoId);
	}

	@Override
	public Todo updateTodo(long todoId, Todo todo) {
		return todoDAO.updateTodo(todoId, todo);
	}

	@Override
	public long deleteTodo(long todoId) {
		todoDAO.deleteTodo(todoId);
		return todoId;
	}

}
