package com.Leta.MainPackage;

import org.springframework.stereotype.Component;

@Component
public class Student {

	String name="Abebe";
	String techStack="Java";
	
	public Student() {}
	
	public void doBusinessLogics() {
		
		System.out.println("ON PROCESS . . ." );
		
	}
	
	public void addStudent() {
		System.out.println("\n A student is about to be added");
	}

}
