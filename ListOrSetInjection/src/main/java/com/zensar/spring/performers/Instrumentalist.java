package com.zensar.spring.performers;

import java.util.List;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

/**
 * @author Arib Anwar
 * @creationDate: 9th October 2019 17:16
 * @version: 1.0
 * @describtion: This is an class.
 * 				This has a Song method & its setter getter.
 * 				It implements performer
 * 				It has List of instruments.
 */
public class Instrumentalist implements Performer {
	private String song;
	private Set<Instrument> instruments;
	
	public Instrumentalist() {
		System.out.println("Instrumentalist is Created.");
	}

	




	public Set<Instrument> getInstruments() {
		return instruments;
	}






	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
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
		System.out.println("Song being played is "+song);
		for(Instrument i: instruments) {
			i.play();
		}
	}

}
