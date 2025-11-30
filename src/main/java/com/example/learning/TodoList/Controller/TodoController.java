package com.example.learning.TodoList.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

}
