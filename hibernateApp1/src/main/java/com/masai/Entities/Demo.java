package com.masai.Entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	
	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
	

	EntityManager em=emf.createEntityManager();
	
//   EntityTransaction et= em.getTransaction();
	
   
  Student st= new Student("ram",5654);
  Product p=new Product("di",563);
	em.getTransaction().begin();
	em.persist(st);
	em.persist(p);
	em.getTransaction().commit();


	em.close();
	
	
	
	
	
	
}
}
