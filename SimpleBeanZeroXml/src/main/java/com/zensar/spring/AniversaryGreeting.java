package com.zensar.spring;

import org.springframework.stereotype.Component;
/**
 * @author Arib Anwar
 * @creationDate: 9th Oct 2019 12:53
 * @version:1.0
 * @Description:This implements Greeting class
 * 				This has a default Constructor.
 * 				Using Bean Stereotype Annotation for reducing bean id.
 *
 */
@Component
public class AniversaryGreeting implements Greeting {

	public AniversaryGreeting() {
		System.out.println("Default Constructor of Aniversary Greeting");
	}
	@Override
	public String greet() {
		
		return "This is Aniversary Greeting";
	}

}
