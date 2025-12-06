package com.example.learning.TodoList.Service;

import java.util.List;

import com.example.learning.TodoList.entity.Bucket;

public interface BucketService {
	
	public List<Bucket> getBuckets();
	
	public Bucket getBucket(long bucketId);

	public Bucket createBucket(Bucket bucket);
	
	public Bucket updateBucket(Bucket bucket);
	
	public Bucket deleteBucket(long bucketId);
}
