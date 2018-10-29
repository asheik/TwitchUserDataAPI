package com.asif.viewmodel;

public class User {
	
	private String id;
	private String name;
	private String bio;
	private String createdDate;
	
	public User(String id, String name, String bio, String createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.bio = bio;
		this.createdDate = createdDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
