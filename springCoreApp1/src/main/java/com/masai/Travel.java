package com.masai;

public class Travel {

	private Vehicle v;
	
	private int numberOfPerson;
	//constructor injection point
	public Travel(Vehicle v, int numberOfPerson) {
		
		this.v = v;
		this.numberOfPerson = numberOfPerson;
	}
	

//	public void setNumberOfPerson(int numberOfPerson) {
//		this.numberOfPerson = numberOfPerson;
//	}
//
//
//	//Setter injection point
//	public void setV(Vehicle v) {
//		this.v = v;
//	}
	
	
	public void journey() {
		
//		c.start2();
//		b.ride();
		
		v.go();
       
		System.out.println("Journey Started");
		System.out.println("Number of Person :"+numberOfPerson);
	}


	
	
	
}
