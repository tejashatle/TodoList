package com.example.learning.TodoList.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learning.TodoList.Repository.BucketDAO;
import com.example.learning.TodoList.entity.Bucket;

@Service
public class BucketServiceImpl implements BucketService{
	
	@Autowired
	private BucketDAO bucketDAO;

	@Override
	public List<Bucket> getBuckets() {
		
		return bucketDAO.getBuckets();
	}

	public Bucket getBucket(long bucketId) {
		return bucketDAO.getBucket(bucketId);
	}
	@Override
	public Bucket createBucket(Bucket bucket) {
		
		bucketDAO.createBucket(bucket);
		return bucket;
	}

	@Override
	public Bucket updateBucket(Bucket bucket) {
	
		return bucketDAO.updateBucket(bucket);
	}

	@Override
	public Bucket deleteBucket(long bucketId) {
		
		Bucket bucket = getBucket(bucketId);
		
		if(bucket.getTodos().isEmpty()) {
			bucketDAO.deleteBucket(bucketId);
		}
		return bucket;
	}

}
