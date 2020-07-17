package com.spp.todolist.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spp.todolist.dao.TodoDao;
import com.spp.todolist.dto.Todo;

@Service
public class TodoService implements ITodoService{

	TodoDao todoDao;


	public TodoService() {

	}

	@Autowired
	public void setTodoDao(TodoDao todoDao) {
		this.todoDao = todoDao;
	}

	@Override
	public void registerTodo(String thing, String name, String priority) {
		todoDao.insertTodo(thing,name,priority);

	}

	@Override
	public ArrayList<Todo> readTodos() {

		return todoDao.selectTodo();
	}






}
