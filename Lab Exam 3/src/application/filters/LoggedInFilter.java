package application.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import application.layers.dao.entity.User;


public class LoggedInFilter implements Filter {

    public LoggedInFilter() {
    }

	public void init(FilterConfig fConfig) throws ServletException {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		
		User currentUser = (User) servletRequest.getSession().getAttribute("User");
		if (currentUser!=null) {
			System.out.println("User with id: "+currentUser.getId()+" is here!");
			chain.doFilter(request, response);
		}
		else {
			servletResponse.sendRedirect("login");
		}
		
	}
	
	public void destroy() {
	}

}
