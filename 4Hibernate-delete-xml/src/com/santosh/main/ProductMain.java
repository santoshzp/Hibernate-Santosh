package com.santosh.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.santosh.model.Product;

public class ProductMain {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("com/santosh/config/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Product product = new Product();
		product.setProductId(10);
		
		Transaction transaction = session.beginTransaction();
		session.delete(product);
		transaction.commit();
		System.out.println("delete reacord Successfully...");
		session.close();
		sessionFactory.close();
	}

}
