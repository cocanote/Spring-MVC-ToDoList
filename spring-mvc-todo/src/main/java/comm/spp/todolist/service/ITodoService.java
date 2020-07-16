package comm.spp.todolist.service;

import java.util.ArrayList;

import com.spp.todolist.dto.Todo;



public interface ITodoService {

	void registerTodo(String thing, String name, String priority, String id) ;
	ArrayList<Todo> readTodos();
}
