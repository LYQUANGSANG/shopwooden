package com.sanglq.backend.domain;

public class Category {
	private int categoryid;

	private String name;
	
	private String description;

	public Category(int categoryid, String name, String description) {
		super();
		this.categoryid = categoryid;
		this.name = name;
		this.description = description;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
