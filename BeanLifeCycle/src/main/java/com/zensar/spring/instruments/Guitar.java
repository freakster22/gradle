package com.zensar.spring.instruments;
/**
 * @author Arib Anwar
 * @creationDate: 7th October 2019 17:20
 * @version: 1.0
 * @describtion: This is an Java Class
 * 				This implements Instrument.
 */

public class Guitar implements Instrument{
	public void play() {
		System.out.println("Ting Tin-tin Ting");
	}

	@Override
	public void tune() {
		System.out.println("Guitar is tuned.");
		
	}
	public void clean() {
		System.out.println("Guitar is cleaned.");
	}
}
