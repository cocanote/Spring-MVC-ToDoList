package com.spp.todolist.dto;

public class Todo {
	private String title;
	private String name;
	private int sequence;
	private int id;
	
	public Todo() {
		
	}
	public Todo(String title, String name, int sequence,int id) {
		super();
		this.title = title;
		this.name = name;
		this.sequence = sequence;
		this.id=id;
	}
	
	

	public void setTitle(String title) {
		this.title = title;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Todo [title=" + title + ", name=" + name + ", sequence=" + sequence + ", id=" + id + "]";
	}
	
	
	
}
