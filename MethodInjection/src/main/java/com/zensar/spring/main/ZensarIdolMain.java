package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;
/**
 * @author Arib Anwar
 * @creationDate: 10th October 2019 10:13
 * @version: 1.0
 * @describtion: This is the Main Class.
 * 				
 * 
 */
public class ZensarIdolMain {

	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("performers.xml");
	Performer performer = context.getBean("Houdini",Performer.class);
	performer.perform();
	
	}

}
