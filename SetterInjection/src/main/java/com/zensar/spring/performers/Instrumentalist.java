package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

/**
 * @author Arib Anwar
 * @creationDate: 7th October 2019 17:16
 * @version: 1.0
 * @describtion: This is an class.
 * 				It implements performer
 */
public class Instrumentalist implements Performer {
	private Instrument instrument;
	private String song;

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
		System.out.println("Song being played is "+song+". Instument is: "+instrument);
		instrument.play();
	}

}
