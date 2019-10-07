package com.zensar.spring.poems;

public class TwinkleTwinkle implements Poem {
	private static final String Lines[]= {
			"Twinkle Twinkle Little Star",
			"How I wonder What you are",
			"Up above the World so high",
			"Like a Diamond in the sky"};
	
	@Override
	public void recite() {
		for(String line :Lines)
		System.out.println(line);

	}

}
