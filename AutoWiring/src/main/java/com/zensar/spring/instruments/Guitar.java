package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

/**
 * @author Arib Anwar
 * @creationDate: 9th October 2019 17:02
 * @version: 1.0
 * @describtion: This is an Java Class
 * 				This implements Instrument.
 * 				Using @Component to mark as Bean Class.
 */
@Component
public class Guitar implements Instrument{
	public void play() {
		System.out.println("Ting Tin-tin Ting");
	}

}
