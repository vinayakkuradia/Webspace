import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Catalog extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public Catalog() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Scanner scannerObject = new Scanner(new File(getServletContext().getRealPath("/WEB-INF/catalogText.txt")));
		Map<String, Integer> catalogMap = new HashMap<>();
		while(scannerObject.hasNextLine()) {
			String lineString = scannerObject.nextLine();
			String[] partStrings = lineString.split(" ");
			catalogMap.put(partStrings[0], Integer.parseInt(partStrings[1]));
		}
		
		request.setAttribute("catalogMap", catalogMap);
		request.getRequestDispatcher("index.jsp").include(request, response);
		scannerObject.close();
	}
	
}
