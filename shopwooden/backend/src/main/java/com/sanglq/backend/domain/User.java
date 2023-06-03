package com.sanglq.backend.domain;

public class User {
	private String name;

	private String username;

	private String email;

	private String password;

	private String address;

	private int phonenumber;
	
//1.admin không là user thường
	private int role;

	public User(String name, String email, String password, String address, int phonenumber, String username) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phonenumber = phonenumber;
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

}
