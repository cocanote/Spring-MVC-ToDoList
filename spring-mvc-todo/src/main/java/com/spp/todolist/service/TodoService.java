package com.spp.todolist.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spp.todolist.dao.TodoDao;
import com.spp.todolist.dto.Todo;
import com.spp.todolist.util.Constant;

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
	public void registerTodo(String thing, String name, String priority, String id) {

	}

	@Override
	public ArrayList<Todo> readTodos() {

		return todoDao.selectTodo();
	}
	public String getTest() {
		return todoDao.getTest();
	}

	

	
	
}
