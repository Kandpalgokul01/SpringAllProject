package com.masai.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String pname;
	private int price;
	
	
   public Product() {
	   
   }


public Product(String pname, int price) {
	
	this.pname = pname;
	this.price = price;
}


public int getPid() {
	return pid;
}


public void setPid(int pid) {
	this.pid = pid;
}


public String getPname() {
	return pname;
}


public void setPname(String pname) {
	this.pname = pname;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}
	
   

	
}
