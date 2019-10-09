package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component
public class Flute implements Instrument {
	public void play() {
		System.out.println("Foo Foo Fleee");
	}
}
