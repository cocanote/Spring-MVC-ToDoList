package com.spp.todolist.service;

import java.util.ArrayList;

import com.spp.todolist.dto.Todo;

public interface ITodoService {

	void registerTodo(String thing, String name, String priority) ;
	ArrayList<Todo> readTodos();
	void modifyTodo(String id,String type);
	void removeTodo(String id);
}
