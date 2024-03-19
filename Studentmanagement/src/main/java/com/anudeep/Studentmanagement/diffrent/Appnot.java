package com.anudeep.Studentmanagement.diffrent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Appnot {
	public static void main(String[] args) {
	EntityManagerFactory emf  =  Persistence.createEntityManagerFactory("SachinPamar");
		
	  	EntityManager em  = emf.createEntityManager() ;
	  Pen p=new Pen();
	  p.setColor("red");
	  p.setId(232);
	  new Book().setAuthor("renolds");
	  p.setName("java");
	  em.getTransaction().begin();
		em.persist(p);
	  	
	  	em.getTransaction().commit();
		em.close();
	  
	}

}
