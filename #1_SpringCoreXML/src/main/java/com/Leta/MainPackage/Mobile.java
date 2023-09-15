package com.Leta.MainPackage;

public class Mobile implements Computer {

	String name;
	
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
