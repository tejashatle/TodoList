package com.example.learning.TodoList.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.TodoList.Service.BucketService;
import com.example.learning.TodoList.entity.Bucket;

@RestController
public class BucketController {
	
	@Autowired
	private BucketService bucketService;
	
	
	@GetMapping("/bucket/getBuckets")
	public List<Bucket> getBuckets(){		
		return bucketService.getBuckets();
	}
	
	@GetMapping("/bucket/getBucket/{bucketId}")
	public Bucket getBucket(@PathVariable long bucketId) {
		return bucketService.getBucket(bucketId);
	}
	
	@PostMapping("/bucket/createBucket")
	public Bucket saveBucket(@RequestBody Bucket bucket){
		
		bucketService.createBucket(bucket);
		return bucket;
		
	}
	
	@PutMapping("/bucket/updateBucket")
	public Bucket updateBucket(@RequestBody Bucket bucket) {
		return bucketService.updateBucket(bucket);
	}
	
	@DeleteMapping("/bucket/deleteBucket/{bucketId}")
	public Bucket deleteBucket(@PathVariable long bucketId) {
		return bucketService.deleteBucket(bucketId);
	}
	

}
