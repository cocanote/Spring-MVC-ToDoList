package com.spp.todolist;

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

/**
 * Handles requests for the application home page.
 */

@Controller
@RequestMapping("/list")
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

	@RequestMapping("/main")
	public String main(Model model) {

		ArrayList<Todo> todolist = todoService.readTodos();
		model.addAttribute("list",todolist);
		for(Todo T: todolist) {
			System.out.println(T.getTitle());
		}		

		return "main";
	}
	@RequestMapping(method=RequestMethod.GET,value= "/reg")
	public String mainget(Model model ,HttpServletRequest request) {

		todoService.registerTodo(request.getParameter("thing"),request.getParameter("name"),request.getParameter("sequence") );
		return "redirect:/list/main";
	}

	@RequestMapping("/adtodo")
	public String success(Model model) {

		return "adtodo";
	}
}
