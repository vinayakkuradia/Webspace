import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DemoContextListner implements ServletContextListener {


    public DemoContextListner() {}

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("contextInitialized");
    	ServletContext servletContext = sce.getServletContext();
    	String driverName = sce.getServletContext().getInitParameter("driver");
    	System.out.println(driverName);
    	DemoDriver driverObj = new DemoDriver(driverName);
    	servletContext.setAttribute("driver", driverObj);
    }
	
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("contextDestroyed");
    }
	
}
