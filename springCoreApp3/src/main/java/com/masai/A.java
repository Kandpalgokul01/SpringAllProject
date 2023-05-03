package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class A {
   
	@Autowired
	private B b1;
	
	
	
	public void funA() {
		
		System.out.println("Inside funA at A");
	    System.out.println(b1);
	}
}
