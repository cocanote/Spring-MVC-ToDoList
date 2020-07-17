package com.spp.todolist.dto;

public class Todo {
	private String title;
	private String name;
	private int sequence;
	private int id;
	private String type;
	private String regdate;
	public Todo() {

	}

	public Todo(String title, String name, int sequence, int id, String type, String regdate) {
		super();
		this.title = title;
		this.name = name;
		this.sequence = sequence;
		this.id = id;
		this.type = type;
		this.regdate = regdate;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getSequence() {
		return sequence;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Todo [title=" + title + ", name=" + name + ", sequence=" + sequence + ", id=" + id + "]";
	}



}
