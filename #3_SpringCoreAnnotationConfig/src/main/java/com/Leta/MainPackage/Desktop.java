package com.Leta.MainPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

	String name="This is a Desktop";
	@Autowired
	// @Qualifier("quadCore") // you can specify which object do you want here inaddition to @primary
	MicroProcessor processor;
	
	public Desktop() {
	}

	@Override
	public void displayName() {
		System.out.println(name + "\n" + processor.getProcessorRank());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MicroProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(MicroProcessor processor) {
		this.processor = processor;
	}

}
