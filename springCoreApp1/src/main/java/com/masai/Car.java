package com.masai;

public class Car implements Vehicle {

	public void start2() {
		System.out.println("Car Started");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		start2();
	}
	
}
