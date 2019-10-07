package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

/**
 * @author Arib Anwar
 * @creationDate: 7th October 2019
 * @version: 1.0
 * @describtion: This is an PoeticJuggler Class inherits Juggler
 * 				 This class Overrides perform().
 */
public class PoeticJuggler extends Juggler {
	private Poem poem;
	
	public PoeticJuggler() {
		System.out.println("No argument Constructor of Poetic Juggler");
	}

	public PoeticJuggler(int beanbags, Poem poem) {
		super(beanbags);
		this.poem = poem;
		System.out.println("Parametirized Constructor of Poetic Juggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("While reciting a poem");
		poem.recite();
	}

	
}
