package com.zensar.spring;

/**
 * @author Arib Anwar
 * @creationDate: 7th Oct 2019
 * @version:1.0
 * @Description: This is a POJO Class
 * 				This implements Greeting class
 * 				This has a default Constructor.
 *
 */
public class FestivalGreeting implements Greeting { // This is POJO Class

	public FestivalGreeting() {
		System.out.println("Festival Greeting is Generated!");
	}
	
	@Override
	public String greet() {

		return "Heppy Durga Pooja, Enjoy Coding";
	}

	
}
