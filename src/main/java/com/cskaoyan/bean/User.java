package com.cskaoyan.bean;

/**
 * Created by little Stone
 * Date 2019/6/24 Time 14:45
 */
public class User {
	int id;
	String username;
	String password;
	int age;
	String email;

	public User() {
	}

	public User(String username, String password, int age, String email) {
		this.username = username;
		this.password = password;
		this.age = age;
		this.email = email;
	}

	public User(int id, String username, String password, int age, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				", email='" + email + '\'' +
				'}';
	}
}
