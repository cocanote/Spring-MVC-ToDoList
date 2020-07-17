package com.spp.todolist.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.spp.todolist.dto.Todo;
import com.spp.todolist.util.Constant;


@Repository
public class TodoDao implements ITodoDao{

	JdbcTemplate template =null;
	private ArrayList<Todo> todos;

	public TodoDao() {

	}

	@Override
	public void insertTodo(final String thing,final String name,final String priority){
		template= Constant.template;
		String sql="INSERT INTO todo (title,name,sequence) VALUES (?,?,?)";
		template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, thing);
				ps.setString(2, name);
				ps.setString(3, priority);
			}

		});
	}
	@Override
	public ArrayList<Todo> selectTodo(){
		template= Constant.template;

		String sql ="SELECT title, name, sequence, id, type, regdate FROM todo order by id desc";						
		todos=(ArrayList<Todo>) template.query(sql, new BeanPropertyRowMapper<Todo>(Todo.class));
		return todos;
	}

}