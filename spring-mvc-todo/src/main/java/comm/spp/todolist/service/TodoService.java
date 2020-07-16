package comm.spp.todolist.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.spp.todolist.dao.TodoDao;
import com.spp.todolist.dto.Todo;

public class TodoService implements ITodoService{

	TodoDao todoDao;
	
	@Autowired
	public void setTodoDao(TodoDao todoDao) {
		this.todoDao = todoDao;
	}

	@Override
	public void registerTodo(String thing, String name, String priority, String id) {
		
		
		
	}

	@Override
	public ArrayList<Todo> readTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
