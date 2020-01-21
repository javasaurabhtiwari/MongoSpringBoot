package com.example.demo;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.MongoStudent;
import com.example.demo.Repository.StudentRepo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


@SpringBootApplication
public class MongoDbApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	
		System.out.println("Mongo");
		
	}

}
