package webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todoList = new ArrayList<>();

	static {
		todoList.add(new Todo("Have breakfast", "Life style"));
		todoList.add(new Todo("Read a book", "Life style"));
		todoList.add(new Todo("Going to programming class", "Study"));
	}

	public static List<Todo> retrieveTodoList() {
		return todoList;
	}

	public static void addTodo(Todo todo) {
		todoList.add(todo);
	}
	
	public static void removeTodo(Todo todo) {
		todoList.remove(todo);
	}
}
