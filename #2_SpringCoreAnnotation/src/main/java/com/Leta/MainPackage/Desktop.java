package com.Leta.MainPackage;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

	String name="This is a Desktop";
	
	public Desktop() {
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
