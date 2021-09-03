import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListenerTester extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListenerTester() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DemoDriver demoDriver = (DemoDriver) getServletContext().getAttribute("driver");
		response.getWriter().append(demoDriver.toString());
	}
}
