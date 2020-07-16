package com.spp.todolist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.BeanPropertyBindingResult;

import com.spp.todolist.util.Constant;



public class RoleDao {
	private static String dbUrl = "jdbc:mysql://localhost:3306/connectdb";
	private static String dbUser = "connectuser";
	private static String dbPasswd = "mite";
	JdbcTemplate template =null;

	public RoleDao(){
		template= Constant.template;

	}


	public ArrayList<Role> getRoles(){ ArrayList<Role> Roles = null; 
	String sql ="SELECT description, role_id FROM role order by role_id desc";
	Roles=(ArrayList<Role>) template.query(sql, new BeanPropertyRowMapper<Role>(Role.class));

	return Roles; 

	}



	public Role getRole(Integer roleId) {

		Role role =null;
		String sql="SELECT role_id,description FROM role WHERE role_id = "+roleId;
		role =(Role)template.query(sql, new BeanPropertyRowMapper<Role>(Role.class));

		return role;



	}

}
