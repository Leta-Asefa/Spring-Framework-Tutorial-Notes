package com.Leta.MainPackage;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApplication {

	public static void main(String[] args) {
		
		ApplicationContext factory= new AnnotationConfigApplicationContext(ConfigClass.class);
		Computer computer= factory.getBean(Desktop.class);
		computer.displayName();
		
		
	}

}
