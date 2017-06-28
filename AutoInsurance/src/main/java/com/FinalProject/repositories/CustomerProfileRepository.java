package com.FinalProject.repositories;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.FinalProject.model.CustomerProfile;

@Repository
public class CustomerProfileRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void saveCustomer(CustomerProfile customer){
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(customer);
		tx.commit();
		
	}
	
	
	public CustomerProfile cprofile (String  userid, String passwd){
		 Session session = sessionFactory.getCurrentSession();
		 Transaction tx = session.beginTransaction();
		 CustomerProfile cp = (CustomerProfile) session.createQuery("select c from CustomerProfile c where c.userId =:Uid and c.password =:pwd")
				 .setParameter("Uid",userid)
				 .setParameter("pwd",passwd)
				 .uniqueResult();
		 
		 tx.commit();
		 
		 return cp;
		 
	}
}
