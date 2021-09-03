

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer attemptCount= (Integer) request.getSession().getAttribute("loginAttempt");
		int x = Integer.parseInt(getServletContext().getInitParameter("maxLimit"));
		if (attemptCount==null || attemptCount<=x) {
			RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
			rq.forward(request, response);
		}
		else {
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			pw.append("Prohibited!");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession httpSession= request.getSession(); 
		Integer attemptCount= (Integer) httpSession.getAttribute("loginAttempt");
		
		if(attemptCount==null) {
			httpSession.setAttribute("loginAttempt", 1);
			System.out.println("init");
		}
		else {
			httpSession.setAttribute("loginAttempt", ++attemptCount);
			System.out.println(attemptCount);
		}
		
		
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.write(getInitParameter("username"));
		pw.write(getInitParameter("password"));
		
	}

}
