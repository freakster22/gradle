package com.zensar.spring.performers;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author Arib Anwar
 * @creationDate: 9th October 2019 18:13
 * @version: 1.0
 * @describtion: This is an class.
 * 					Using Map to set Key and Values.
 * 
 */
public class Instrumentalist implements Performer {
	private Properties instrumentSongProps;
	
	public void perform() {
		Enumeration instruments = instrumentSongProps.keys();
		while (instruments.hasMoreElements()) {
			String guitar = (String) instruments.nextElement();
			String song = instrumentSongProps.getProperty(guitar);
			System.out.println(song+" By"+guitar);
			System.out.println("Instrumentalist is Playing Songs.");
			
		}
	}

	public Properties getInstrumentSongProps() {
		return instrumentSongProps;
	}

	public void setInstrumentSongProps(Properties instrumentSongProps) {
		this.instrumentSongProps = instrumentSongProps;
	}
	

}
