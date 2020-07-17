package com.spp.todolist.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spp.todolist.dto.Todo;
import com.spp.todolist.util.Constant;


@Repository
public class TodoDao implements ITodoDao{

	JdbcTemplate template =null;
	private ArrayList<Todo> todos;
	
	String test;
	
	public String getTest() {
		return test;
	}
	public TodoDao() {
		test="please";
	}
	
	@Override
	public void insertTodo(Todo td){
		
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver");
		 * 
		 * } catch (ClassNotFoundException e) { e.printStackTrace(); } String sql =
		 * "INSERT INTO todo (title, name, sequence) VALUES(?, ?, ?)";
		 * 
		 * try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);
		 * PreparedStatement ps = conn.prepareStatement(sql)){ ps.setString(1 ,
		 * td.getThingToDo()); ps.setString(2 , td.getWhoToDo()); ps.setInt(3 ,
		 * td.getPriority()); ps.executeUpdate();
		 * 
		 * 
		 * }catch (Exception ex) { ex.printStackTrace();
		 * 
		 * }
		 */
}
	@Override
	public ArrayList<Todo> selectTodo(){
		template= Constant.template;
		
		String sql ="SELECT title, name, sequence, id FROM todo order by id desc";						
		todos=(ArrayList<Todo>) template.query(sql, new BeanPropertyRowMapper<Todo>(Todo.class));
		return todos;
}
	
}