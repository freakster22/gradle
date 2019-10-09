package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("performers.xml");
	Performer performer = context.getBean("slash",Performer.class);
	performer.perform();
	
	Performer performer2 = context.getBean("childBean",Performer.class);
	performer2.perform();
	
	Performer performer3 = context.getBean("childChildBean",Performer.class);
	performer3.perform();
	}

}
