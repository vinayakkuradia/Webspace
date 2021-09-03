package practice.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifecycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private AtomicLong counter = new AtomicLong(0);
    
    public ServletLifecycle() {
        super();
        
    }

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Servlet being destroyed!");
		System.out.println("Total count: "+counter);
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Servlet object is created");
		System.out.println("Initial count is: "+counter);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter resonseWriterObj = response.getWriter();
		resonseWriterObj.append("This is GET method of Servlet<br />Site Visit Count: "+ (counter.addAndGet(1)));
		System.out.println("Site Counter: "+counter);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
