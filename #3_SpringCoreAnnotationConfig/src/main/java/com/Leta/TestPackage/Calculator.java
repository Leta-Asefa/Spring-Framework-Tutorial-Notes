package com.Leta.TestPackage;
import org.springframework.stereotype.Component;

import com.Leta.MainPackage.Computer;

@Component
public class Calculator implements Computer{
	
	String name="This is a Calculator";

	public Calculator() {
	}	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void displayName() {
		System.out.println(name);
	}

}
