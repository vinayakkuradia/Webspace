package application.controller.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import application.layers.service.TraineeService;
import application.layers.service.TraineeServiceImpl;

public class ShowAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	TraineeService traineeServiceObjecTraineeService;
	
    public ShowAll() {
    	traineeServiceObjecTraineeService = new TraineeServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("traineeList", traineeServiceObjecTraineeService.getAllTrainees());
		request.getRequestDispatcher("/WEB-INF/views/ShowAll.jsp").include(request, response);
	}
}
