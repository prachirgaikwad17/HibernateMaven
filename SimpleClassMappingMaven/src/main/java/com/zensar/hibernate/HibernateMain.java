package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/**
 * Hello world!
 *
 */
public class HibernateMain 
{
    public static void main( String[] args )
    {
    	Configuration c=new Configuration().configure();
    	SessionFactory f=c.buildSessionFactory();
    	Session s=f.openSession();
    	Transaction t=s.beginTransaction();
    	
    	Product p=new Product();
    	p.setProductId(1002);
    	p.setName("Laptop");
    	p.setBrand("HP");
    	p.setPrice(50000);    	
    	s.save(p);
    	System.out.println("Product is saved");
    	
    	
    	t.commit();
    	s.close();
    }
}
