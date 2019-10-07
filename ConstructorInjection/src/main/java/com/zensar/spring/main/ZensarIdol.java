package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdol {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("performers.xml");
		Performer performer = context.getBean("pyare Mohan", Performer.class);
		performer.perform();
	}

}
