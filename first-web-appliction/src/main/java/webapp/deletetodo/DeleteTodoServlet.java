package webapp.deletetodo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.todo.Todo;
import webapp.todo.TodoService;

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {

	private static final long serialVersionUID = 8244495226161130475L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TodoService.removeTodo(new Todo(request.getParameter("todo"), request.getParameter("category")));
		response.sendRedirect("/list-todos.do");
	}

}
