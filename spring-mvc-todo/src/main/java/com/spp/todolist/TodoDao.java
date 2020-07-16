package com.spp.todolist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class TodoDao {

	private static String dbUrl = "jdbc:mysql://localhost:3306/connectdb";
	private static String dbUser = "connectuser";
	private static String dbPasswd = "mite";
	
	public void InsertTodo(Todo td){
		
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
}