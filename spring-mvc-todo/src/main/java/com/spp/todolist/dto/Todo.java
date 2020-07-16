package com.spp.todolist.dto;

public class Todo {
	private String thing;
	private String name;
	private int priority;
	private int id;
	
	public Todo(String thingToDo, String whoToDo, int priority,int id) {
		super();
		this.thing = thingToDo;
		this.name = whoToDo;
		this.priority = priority;
		this.id=id;
	}
	
	public String getThingToDo() {
		return thing;
	}
	public void setThingToDo(String thingToDo) {
		this.thing = thingToDo;
	}
	public String getWhoToDo() {
		return name;
	}
	public void setWhoToDo(String whoToDo) {
		this.name = whoToDo;
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
		return "Todo [thingToDo=" + thing + ", whoToDo=" + name + ", priority=" + priority + ", id=" + id + "]";
	}
	
	
	
}
