package com.example.learning.TodoList.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.learning.TodoList.entity.Bucket;
import com.example.learning.TodoList.entity.Todo;

public interface BucketDAO {
	
	public List<Bucket> getBuckets();
	
	public Bucket getBucket(long bucketId);
	
	public Bucket createBucket(Bucket bucket);
	
	public Bucket updateBucket(Bucket bucket);
	
	public Bucket deleteBucket(long bucketId);

}
