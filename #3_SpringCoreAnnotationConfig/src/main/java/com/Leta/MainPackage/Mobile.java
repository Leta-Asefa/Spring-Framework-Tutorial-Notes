package com.Leta.MainPackage;

import org.springframework.stereotype.Component;

@Component
public class Mobile implements Computer {

	String name="This is A Mobile";
	
	public Mobile() {
	}

	@Override
	public void displayName() {
		System.out.println(name);
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
