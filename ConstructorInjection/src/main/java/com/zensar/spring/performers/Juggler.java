package com.zensar.spring.performers;

public class Juggler implements Performer {
	private int beanBags;

	public Juggler() {
		System.out.println("No-Argument constructor of Juggler");
	}

	public Juggler(int beanbags) {
		super();
		this.beanBags = beanbags;
		System.out.println("Parameterized Constructor of Juggler");
		
	}

	
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Juggler Juggling BeanBags "+beanBags+" BeanBags");
	}

}
