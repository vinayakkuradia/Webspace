package validation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Signup() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/Signup.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int passwordLength = request.getParameter("password1").length();
		String passwordString="";
		for (int i=0; i<passwordLength;i++) {passwordString+="*";}
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<h3>Following Details are received:</h3><br />");
		printWriter.print("Full Name: "+request.getParameter("fullName")+"<br />");
		printWriter.print("Username: "+request.getParameter("username")+"<br />");
		printWriter.print("Password: "+passwordString+"<br />");
		printWriter.print("Gender: "+request.getParameter("gender")+"<br />");
	}

}
