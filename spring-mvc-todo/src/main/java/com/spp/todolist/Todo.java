package com.spp.todolist;

public class Todo {
	private String thingToDo;
	private String whoToDo;
	private int priority;
	
	public Todo(String thingToDo, String whoToDo, int priority) {
		super();
		this.thingToDo = thingToDo;
		this.whoToDo = whoToDo;
		this.priority = priority;
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
	
	
}
