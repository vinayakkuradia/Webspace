package demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		// Adding Book
		session.beginTransaction();
		Book book = new Book();
		session.save(object);
	}
}
