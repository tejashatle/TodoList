package com.example.learning.TodoList.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.learning.TodoList.entity.Bucket;
import com.example.learning.TodoList.entity.Todo;

@Repository
public class BucketImpl implements BucketDAO{
	
	@Autowired
	private TodoDAO todoDAO;
	
	
	public static List<Bucket> buckets = new ArrayList<Bucket>();
	
	public List<Bucket> getBuckets(){
		
		
		
		for(Bucket bucket: buckets) {
			List<Todo> todoList = new ArrayList<Todo>();
			todoList = todoDAO.getTodoByBucketId(bucket.getBucketId());
			bucket.setTodos(todoList);
		}
		return buckets;
	}
	
	@Override
	public Bucket getBucket(long bucketId) {
		
		List<Bucket> bucketToReturn = new ArrayList<Bucket>();
		for(Bucket bucket: buckets) {
			if(bucket.getBucketId() == bucketId) {
				bucketToReturn.add(bucket);
			}
		}
		
		bucketToReturn.get(0).setTodos(todoDAO.getTodoByBucketId(bucketId));
		
		return bucketToReturn.get(0);
	}

	@Override
	public Bucket createBucket(Bucket bucket) {
		
		buckets.add(bucket);
		return bucket;
	}

	@Override
	public Bucket updateBucket(Bucket bucket) {
		
		Bucket bucketToUpdate = getBucket(bucket.getBucketId());
		
		buckets.remove(bucketToUpdate);
		bucketToUpdate.setBucketName(bucket.getBucketName());
		bucketToUpdate.setBucketDescription(bucket.getBucketDescription());
		bucketToUpdate.setCategory(bucket.getCategory());
		bucketToUpdate.setTodos(bucket.getTodos());
		
		List<Todo> todoList = todoDAO.getTodoByBucketId(bucket.getBucketId());
		for(Todo todo: todoList) {
			todoDAO.deleteTodo(todo.getTodoId());
		}
		
		for(Todo todo: bucket.getTodos()) {
			todoDAO.saveTodo(todo);
		}
		
		
		buckets.add(bucketToUpdate);
		return bucketToUpdate;
	}

	@Override
	public Bucket deleteBucket(long bucketId) {
		
		Bucket buketToDelete = getBucket(bucketId);
		buckets.remove(buketToDelete);
		return null;
	}

	
	
	

}
