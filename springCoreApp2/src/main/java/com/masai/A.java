package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class A {
   
	@Autowired
	@Qualifier(value = "b5")
	private B b1;
	
	
	
	public void funA() {
		
		System.out.println("Inside funA at A");
	    System.out.println(b1);
	}
}
