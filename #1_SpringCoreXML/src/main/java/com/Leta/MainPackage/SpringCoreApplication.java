package com.Leta.MainPackage;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApplication {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Computer computer=(Computer) context.getBean("laptop");
		computer.displayName();
		
		
	// There are 3 ways to configure
	// 1. XML		2. Annotation  ( using @Component )		3.JavaBased (using @Congfiguration )
		
	}

}
