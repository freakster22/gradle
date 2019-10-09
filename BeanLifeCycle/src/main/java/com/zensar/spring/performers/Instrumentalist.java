package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

/**
 * @author Arib Anwar
 * @creationDate: 7th October 2019 17:16
 * @modificationDate: 9th October 2019 10:36
 * @version: 2.0
 * @describtion: This is an class.
 * 				It implements performer
 */
public class Instrumentalist implements Performer,BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {
	private Instrument instrument;
	private String song;
	private String name;

	public Instrumentalist() {
		System.out.println("Instrumentalist is Created.");
	}

	

	public Instrument getInstrument() {
		return instrument;
	}



	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set!");
	}



	public String getSong() {
		return song;
	}



	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is sung!");
	}



	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Song being played is "+song+". Instument is:Guitar By: "+name);
		instrument.play();
	}



	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.name= name;
		System.out.println("bean name is set.");
	}



	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Factory is set.");
	}



	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Application Context is Aware.");
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean\n");
		
		//instrument.tune();
	}
	public void tuneInstrument() {
		System.out.println("Custom init method");
		instrument.tune();
	}



	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Method!");
		instrument.clean();
	}
	public void cleanInstrument() {
		System.out.println("\n Clean \tClean\tClean");
	}

}
