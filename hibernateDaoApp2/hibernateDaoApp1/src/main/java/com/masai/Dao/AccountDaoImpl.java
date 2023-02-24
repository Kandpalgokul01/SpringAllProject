package com.masai.Dao;

import javax.persistence.EntityManager;

import com.masai.Util.EMUtil;
import com.masai.model.Account;

public class AccountDaoImpl implements AccountDao {

	public boolean createAccount(Account account) {
	boolean  flag=false;
	
	EntityManager em=EMUtil.provideEntityManager();
	 em.getTransaction().begin();
	 em.persist(account);
	 flag=true;
	 em.getTransaction().commit();
	 
	 em.clear();
		return flag;
	}

	public boolean deleteAccount(int accno) {
		
		boolean  flag=false;
		
		EntityManager em=EMUtil.provideEntityManager();
		Account  ac=em.find(Account.class, accno);
		
		if(ac!=null) {
			em.getTransaction().begin();
			 
			 em.remove(ac);
			 flag=true;
			 em.getTransaction().commit();
			 
		}
		
		em.close();
		
		return flag;
	 
	}

	public boolean updateAccount(Account acc) {
       boolean  flag=false;
		
		EntityManager em=EMUtil.provideEntityManager();
		
		Account  ac=em.find(Account.class, acc.getAccno());
		
		if(ac!=null) {
			em.getTransaction().begin();
			 
			 em.merge(acc);			
			 flag=true;
			 em.getTransaction().commit();
			 
		}else {
			throw new IllegalArgumentException("Invalid Account");
		}
		
		em.close();
		
		return flag;
	}

	public Account findAccount(int accno) {
		
		return EMUtil.provideEntityManager().find(Account.class,accno);
	}

	
}
