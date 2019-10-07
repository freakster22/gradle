package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;
import com.zensar.spring.performers.PoeticJuggler;
/**
 * @author Arib Anwar
 * @creationDate: 7th October 2019
 * @version: 1.0
 * @describtion: This is an the Main Class
 * 				This imports Spring bean FrameWork
 */
public class ZensarIdol {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("performers.xml");
		Performer performer = context.getBean("pyare Mohan", Performer.class);
		performer.perform();
		
		
		Performer performer2 = context.getBean("something",Performer.class);
		performer2.perform();
		
		
	}

}
