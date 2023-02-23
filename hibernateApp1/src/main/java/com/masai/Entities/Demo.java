package com.masai.Entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	
	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
	

	EntityManager em=emf.createEntityManager();
	
//   EntityTransaction et= em.getTransaction();
	
   
  Student st= new Student(40,"ram",5654);
	em.getTransaction().begin();
	em.persist(st);
	
	em.getTransaction().commit();


	em.close();
	
	
	
	
	
	
}
}
