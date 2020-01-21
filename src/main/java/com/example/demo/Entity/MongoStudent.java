package com.example.demo.Entity;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MongoStudent {

	@Id
	private int id;
	private String uname;
	private String upass;
	@Override
	public String toString() {
		return "MongoStudent [id=" + id + ", uname=" + uname + ", upass=" + upass + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
}
