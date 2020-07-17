package com.spp.todolist.dao;

import java.util.ArrayList;

import com.spp.todolist.dto.Todo;

public interface ITodoDao {
	void insertTodo(String thing, String name, String priority);
	ArrayList<Todo> selectTodo();
	void updateTodo(String id,String type);
	void deleteTodo(String id);
}
