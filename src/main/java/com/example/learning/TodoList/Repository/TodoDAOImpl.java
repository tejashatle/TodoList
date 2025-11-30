package com.example.learning.TodoList.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.learning.TodoList.entity.Todo;

@Repository
public class TodoDAOImpl implements TodoDAO{
	
	public static List<Todo> todos = new ArrayList<Todo>();
	

	@Override
	public List<Todo> getTodoList() {
		return todos;
	}


	@Override
	public Todo saveTodo(Todo todo) {
		todos.add(todo);
		return todo;
	}

}
