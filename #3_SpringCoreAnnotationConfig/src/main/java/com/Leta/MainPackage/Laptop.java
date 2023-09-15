package com.Leta.MainPackage;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

	String name="This is a Laptop";
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayName() {
		System.out.println(name);
			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
