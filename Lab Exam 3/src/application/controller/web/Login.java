package application.controller.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import application.exceptions.UserNotFoundException;
import application.layers.dao.entity.User;
import application.layers.service.UserService;
import application.layers.service.UserServiceImpl;

public class Login extends HttpServlet {
   
	private static final long serialVersionUID = 6189209323084063317L;
	private UserService userService=new UserServiceImpl();
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);;
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			System.out.println(username+":"+password);
			User currentUser = userService.getUser(username, password);
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("User", currentUser);
			response.sendRedirect("showall.do");
			
		} catch (UserNotFoundException ex) {
			System.out.println("User not found");
			response.sendRedirect("login");
		}
	}

}
