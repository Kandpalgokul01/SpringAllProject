package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		

		
		//activate the spring IOC Container
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Pulling the Spring Bean obj with the help of id
		Travel obj=ctx.getBean("tr",Travel.class);
		
		obj.journey();
	}

}
