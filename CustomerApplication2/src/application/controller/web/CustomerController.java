package application.controller.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import application.exceptions.DaoException;
import application.layers.dao.Customer;
import application.layers.service.CustomerServiceImpl;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CustomerServiceImpl custServiceObj = new CustomerServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String address = request.getParameter("address");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		
		
		Customer newCustomerObject = new Customer(firstname, lastname, address, mobile, email);
		try {
			custServiceObj.addCustomer(newCustomerObject);
		}
		catch(DaoException e) {
			System.out.println("Dao Exception Occurred!\nException Message: "+e.getLocalizedMessage());
		}
		
		response.sendRedirect("success");
		
	}

}
