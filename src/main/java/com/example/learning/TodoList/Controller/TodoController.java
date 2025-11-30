package com.example.learning.TodoList.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.TodoList.Service.TodoService;
import com.example.learning.TodoList.entity.Todo;

@RestController
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/todos")
	public List<Todo> getTodos(){
		return todoService.getTodoList();
	}
	
	@PostMapping("/saveTodo")
	public Todo saveTodo(@RequestBody Todo todo) {
		return todoService.saveTodo(todo);
	}
	
	@GetMapping("/getTodo/{todoId}")
	public Todo getTodo(@PathVariable long todoId) {
		return todoService.getTodo(todoId);
	}
	
	@PutMapping("/updateTodo/{todoId}")
	public Todo updateTodo(@PathVariable long todoId, @RequestBody Todo todo) {
		
		todoService.updateTodo(todoId, todo);
		return todo;
		
	}
	
	@DeleteMapping("/deleteTodo/{todoId}")
	public long deleteTodo(@PathVariable long todoId) {
		todoService.deleteTodo(todoId);
		return todoId;
	}

}
