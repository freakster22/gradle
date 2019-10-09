package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.Greeting;
/**
 * @author Arib Anwar
 * @creationDate: 7th Oct 2019
 * @version:1.0
 * @Description: This is a POJO Class
 * 				This implements Greeting class
 * 				This has a default Constructor.
 *
 */
public class SpringMain {

	public static void main(String[] args) {
		//Creating the object of Spring IOC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("greetings.xml");
		
		Greeting greeting1 = context.getBean("festival",Greeting.class);
		System.out.println(greeting1.greet());
		
		Greeting greeting2 = context.getBean("aniversaryGreeting",Greeting.class);
		System.out.println(greeting2.greet());
		
		/*
		 * Greeting greeting3 = context.getBean("festiveGreetings",Greeting.class);
		 * System.out.println(greeting3.greet());
		 */
	}

}
