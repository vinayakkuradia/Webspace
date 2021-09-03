package application.controller.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuccessController
 */
public class SuccessController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String address = request.getParameter("address");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		
		PrintWriter responseWriterObj = response.getWriter();
		responseWriterObj.print("You are registered! <br />");
		responseWriterObj.print("Name: "+firstname+" "+lastname+"<br />");
		responseWriterObj.print("Address: "+address+"<br />");
		responseWriterObj.print("Mobile: "+mobile+"<br />");
		responseWriterObj.print("Email: "+email+"<br />");
	}

}
