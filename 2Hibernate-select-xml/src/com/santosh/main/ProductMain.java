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
		
		Product product = (Product)session.get(Product.class, 10);
		
		System.out.println("==================Result===============");	
		System.out.println("ProductId="+product.getProductId());
		System.out.println("Product Name="+product.getProductName());
		System.out.println("Product price="+product.getPrice());
		System.out.println("===============END=====================");
	
		session.close();
		sessionFactory.close();
	}

}
