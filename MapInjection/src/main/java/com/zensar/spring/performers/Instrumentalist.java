package com.zensar.spring.performers;

import java.util.Map;

import com.zensar.spring.instruments.Instrument;

/**
 * @author Arib Anwar
 * @creationDate: 9th October 2019 18:13
 * @version: 1.0
 * @describtion: This is an class.
 * 					Using Map to set Key and Values.
 * 
 */
public class Instrumentalist implements Performer {
	private Map<Instrument, String> instrumentSongMap;

	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}

	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}

	public void perform() {
		System.out.println("Instrumentalist is Playing Songs: ");

		for (Map.Entry<Instrument, String> entry : instrumentSongMap.entrySet()) {
			System.out.print("Song "+entry.getValue()+" By: ");
			entry.getKey().play();
			
			
		}

	}

}
