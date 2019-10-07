package com.zensar.spring;

public class AniversaryGreeting implements Greeting {

	public AniversaryGreeting() {
		System.out.println("Default Constructor of Aniversary Greeting");
	}
	@Override
	public String greet() {
		
		return "This is Aniversary Greeting";
	}

}
