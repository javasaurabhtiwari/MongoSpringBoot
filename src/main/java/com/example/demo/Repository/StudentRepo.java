package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.MongoStudent;

@Repository
public interface StudentRepo extends MongoRepository<MongoStudent,Integer> {

	
}
