package com.hcq.rest.bean;

public class Couse {
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Greeting [id=" + id + ", name=" + name + "]";
	}
	public Couse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Couse(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
