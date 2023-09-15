package com.Leta.MainPackage;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class HelperClass {

	@Before("execution (public void doBusinessLogics())")
	public void creategConnection() {
		System.out.println("Connection is being created  . . .");
	
		//	Before Advice: Executed before a join point.
	//Commonly used for tasks like logging, security checks, or pre-processing.
	}
	
	@After("execution (public void doBusinessLogics())")
	public void mantainLogFile() {
		
		System.out.println("Log File is being maintained . . .");

		//	After Advice: Executed after a join point (regardless of whether it completed successfully 
	//			or threw an exception).Useful for post-processing tasks.
	}
	
	// @Around("execution (public void doBusinessLogics())")
	public void closeConnection() {
		System.out.println("Connection is being closed . . .");
	}
	
	
	// There are also after return  and after throwing advice take a look on them . . .
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
