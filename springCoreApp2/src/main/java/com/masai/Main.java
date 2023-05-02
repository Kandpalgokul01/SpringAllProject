package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		A a=ctx.getBean("a",A.class);
		a.funA();
	}

}
