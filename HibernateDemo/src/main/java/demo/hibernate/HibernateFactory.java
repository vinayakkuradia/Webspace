package demo.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateFactory {
	private static SessionFactory factory = null;
	
	public HibernateFactory() {
	}
	
	public static SessionFactory getSessionFactory() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();
		if(factory==null) {
			factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		}
		return factory;
	}
}
