package application.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class LoggedInFilter implements Filter {

    public LoggedInFilter() {
    }

	public void init(FilterConfig fConfig) throws ServletException {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filtered");
		chain.doFilter(request, response);
	}
	
	public void destroy() {
	}

}
