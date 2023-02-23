package com.masai.Entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {

	
	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
	

	EntityManager em=emf.createEntityManager();
	
   EntityTransaction et= em.getTransaction();
	
   
  Student st= em.find(Student.class, 20);
	et.begin();
	em.remove(st);
	
	et.commit();


	em.close();
	
	
	
	
	
	
}
}
