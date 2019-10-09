package com.zensar.spring;

import org.springframework.stereotype.Component;

/**
 * @author Arib Anwar
 * @creationDate: 9th Oct 2019 12:51
 * @version:1.0
 * @Description: This is a POJO Class
 * 				This implements Greeting class
 * 				This has a default Constructor.
 * 				Using Bean Stereotype Annotation for reducing bean id.
 *
 */
@Component("festival")
public class FestivalGreeting implements Greeting { // This is POJO Class

	public FestivalGreeting() {
		System.out.println("Festival Greeting is Generated!");
	}
	
	@Override
	public String greet() {

		return "Heppy Durga Pooja, Enjoy Coding";
	}

	
}
