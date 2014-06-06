package com.codepath.example.newbootcamp;

import java.util.ArrayList;

public class User {
	private String name;
	private String hometown;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHometown() {
		return hometown;
	}
	
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	public User (String name, String hometown){
		this.name = name;
		this.hometown = hometown;
	}
	
	public static ArrayList<User> fakeUsers(){
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Tim","california"));
		users.add(new User("Nathan", "San Diego"));
		return users;
	}
	
}
