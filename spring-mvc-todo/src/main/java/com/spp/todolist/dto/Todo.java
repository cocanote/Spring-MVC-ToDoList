package com.spp.todolist.dto;

public class Todo {
	private String thingToDo;
	private String whoToDo;
	private int priority;
	private int id;
	
	public Todo(String thingToDo, String whoToDo, int priority,int id) {
		super();
		this.thingToDo = thingToDo;
		this.whoToDo = whoToDo;
		this.priority = priority;
		this.id=id;
	}
	
	public String getThingToDo() {
		return thingToDo;
	}
	public void setThingToDo(String thingToDo) {
		this.thingToDo = thingToDo;
	}
	public String getWhoToDo() {
		return whoToDo;
	}
	public void setWhoToDo(String whoToDo) {
		this.whoToDo = whoToDo;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getID() {
		return id;
	}
	public void setID(int iD) {
		id = iD;
	}

	@Override
	public String toString() {
		return "Todo [thingToDo=" + thingToDo + ", whoToDo=" + whoToDo + ", priority=" + priority + ", id=" + id + "]";
	}
	
	
	
}
