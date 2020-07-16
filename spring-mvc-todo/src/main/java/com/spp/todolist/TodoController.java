package com.spp.todolist;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spp.todolist.dao.TodoDao;
import com.spp.todolist.dto.Role;
import com.spp.todolist.dto.Todo;
import com.spp.todolist.util.Constant;

/**
 * Handles requests for the application home page.
 */

@Controller
@RequestMapping("/list")
public class TodoController {
	
	public JdbcTemplate template;
	public TodoDao todoDao;
	
	
	  @Autowired 
	  public void setTemplate(JdbcTemplate template) {
	  
	  this.template = template; Constant.template=this.template;
	  
	  }
	  
	 
	
	
	@RequestMapping("/main")
	public String home(Model model) {
		
		todoDao =new TodoDao();
		ArrayList<Todo> todolist = todoDao.selectTodo();
		for(Todo T: todolist) {
			System.out.println(T.toString());
		}
		return "main";
	}
	
	@RequestMapping("/adtodo")
	public String success(Model model) {
		
		return "adtodo";
	}
	
	@RequestMapping("/fail")
	public String fail(Model model) {
		
		return "fail";
	}
	
}
