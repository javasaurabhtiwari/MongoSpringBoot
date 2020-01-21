package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.MongoStudent;
import com.example.demo.Repository.StudentRepo;

@RestController
public class Controller {

	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/mongo")
	public void show()
	{
		
		MongoStudent data=new MongoStudent();
		data.setId(0);
		data.setUname("saurabh");
		data.setUpass("123");
		repo.save(data);
		
		MongoStudent	data1=new MongoStudent();
		data1.setId(1);
		data1.setUname("saurabh123");
		data1.setUpass("123456");
		repo.save(data1);
	}
}
