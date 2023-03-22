package com.masai.UseCases;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.Util.EMUtil;
import com.masai.model.Account;

public class Demo {
  

	public static void main(String[] args) {
	
//		List<Account> list=Arrays.asList(
//				               new Account(10,"ram",20),
//				               new Account(20,"shyam",30));
		
       EntityManager em= EMUtil.provideEntityManager();
		
		
		//String jpql= "select a from Account a";
		String jpql= "from Account";
		Query q= em.createQuery(jpql);
		
		List<Account> list= q.getResultList();
		
		
		list.forEach(l -> System.out.println(l));
		
		em.close();

	}
	
	
}
