

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MailDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MailDispatcher() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher reqDisp = request.getRequestDispatcher("index.jsp");
		reqDisp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String [] redirectURL = {"https://www.google.com/gmail/about/",
				"https://www.rediff.com/",
				"https://in.mail.yahoo.com/",
				"https://outlook.live.com/owa/"
				};
		int mailProvider = Integer.parseInt(request.getParameter("mailProvider"));
		if(mailProvider==0) {
			response.sendError(404);
		}
		else if(mailProvider<5 && mailProvider>0)
			response.sendRedirect(redirectURL[mailProvider-1]);
		else {
			PrintWriter pW = response.getWriter();
			response.setContentType("text/html");
			pW.write("Illegal request!");
		}
		
	}

}
