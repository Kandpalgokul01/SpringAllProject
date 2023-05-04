package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		A a1=ctx.getBean("a",A.class);
		
		a1.funA();
		
		
		((AnnotationConfigApplicationContext)ctx).close();
		
	}

}
