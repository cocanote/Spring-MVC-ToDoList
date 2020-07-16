package com.spp.todolist.dao;

import java.util.ArrayList;

import com.spp.todolist.dto.Todo;

public interface ITodoDao {
	void insertTodo(Todo td);
	ArrayList<Todo> selectTodo();

}
