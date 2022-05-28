package com.om.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from Spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alfaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alfaCoach);
		
		//print results
		System.out.println(result);
		System.out.println("\nMemory location for theCoach" + theCoach);
		System.out.println("\nMemory location for alfaCoach" + alfaCoach);
		
		context.close();
	}

}
