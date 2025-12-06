package com.example.learning.TodoList.entity;

import java.util.List;

public class Bucket {

	private long bucketId;
	private String bucketName;
	private String bucketDescription;
	private String category;
	private List<Todo> todos;
	
	
	
	public long getBucketId() {
		return bucketId;
	}
	public void setBucketId(long bucketId) {
		this.bucketId = bucketId;
	}
	public String getBucketName() {
		return bucketName;
	}
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}
	public String getBucketDescription() {
		return bucketDescription;
	}
	public void setBucketDescription(String bucketDescription) {
		this.bucketDescription = bucketDescription;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<Todo> getTodos() {
		return todos;
	}
	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}
	
	
	
}
