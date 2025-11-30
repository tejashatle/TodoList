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


	@Override
	public Todo getTodo(long todoId) {
		ArrayList<Todo> todoToReturn = new ArrayList<Todo>();
		for(Todo todo : todos){
			if(todo.getTodoId() == todoId) {
				todoToReturn.add(todo);
			}
		}
		return (Todo) todoToReturn.get(0);
	
	}


	@Override
	public Todo updateTodo(long todoId, Todo todo) {
		
		Todo todoToUpdate = getTodo(todoId);
		
		todoToUpdate.setTodoName(todo.getTodoName());
		todoToUpdate.setTodoDescription(todo.getTodoDescription());
		todoToUpdate.setDueDate(todo.getDueDate());
		todoToUpdate.setCompleted(todo.isCompleted());
		
		return todoToUpdate;
	}


	@Override
	public long deleteTodo(long todoId) {
		
		Todo todoToDelete = getTodo(todoId);
		todos.remove(todoToDelete);
		
		return todoId;
	}
	
	
	
	
	

}
