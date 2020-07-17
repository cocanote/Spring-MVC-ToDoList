package com.spp.todolist.Controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spp.todolist.dao.TodoDao;
import com.spp.todolist.dto.Todo;
import com.spp.todolist.service.TodoService;
import com.spp.todolist.util.Constant;

@Controller

public class TodoController {

	public JdbcTemplate template;
	public TodoService todoService;
	public TodoDao todoDao;

	public TodoController() {

	}

	@Autowired 
	public void setTemplate(JdbcTemplate template) {

		this.template = template;
		Constant.template=this.template;
	}

	@Autowired 
	public void setTodoService(TodoService todoService) {

		this.todoService = todoService;
	}

	@RequestMapping("/")
	public String main(Model model) {

		ArrayList<Todo> todolist = todoService.readTodos();
		model.addAttribute("list",todolist);
		return "main";
	}
	@RequestMapping(method=RequestMethod.GET,value= "/reg")
	public String mainget(Model model ,HttpServletRequest request) {

		todoService.registerTodo(request.getParameter("thing"),request.getParameter("name"),request.getParameter("sequence") );
		return "redirect:/";
	}

	@RequestMapping("/adtodo")
	public String adtodo(Model model) {

		return "adtodo";
	}
	@RequestMapping(method=RequestMethod.GET,value= "/mod")
	public String modifyTodo(Model model,HttpServletRequest request) {
		
		if(request.getParameter("modi")=="del")
		todoService.removeTodo(request.getParameter("id"));
		else
		todoService.modifyTodo(request.getParameter("id"), request.getParameter("type"));
		return "redirect:/";
	}
}
