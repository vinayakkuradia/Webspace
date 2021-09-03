package application.controller.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import application.layers.dao.entity.Branch;
import application.layers.dao.entity.Trainee;
import application.layers.service.TraineeService;
import application.layers.service.TraineeServiceImpl;

public class AddTrainee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	TraineeService traineeServiceObjecTraineeService;
	
    public AddTrainee() {
    	traineeServiceObjecTraineeService = new TraineeServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/AddTrainee.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String) request.getParameter("traineeName");
		Branch branch = Branch.valueOf((String)request.getParameter("traineeBranch"));
		float percentage = Float.parseFloat((String)request.getParameter("traineePercentage"));
		
		Trainee trainee = new Trainee(name, branch, percentage);
		traineeServiceObjecTraineeService.addTrainee(trainee);
		
		response.sendRedirect("showall.do");
	}

}
