package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("performers.xml");

		  Performer performer = context.getBean("slash",Performer.class);
		  performer.perform();
		 ConfigurableApplicationContext cfgContext= (ConfigurableApplicationContext) context; 
				 System.out.println(cfgContext);
	    	
	    	((ConfigurableApplicationContext) context).close();
	}

}
