package com.zensar.spring.performers;

import com.zensar.spring.magicboxes.MagicBox;
/**
 * @author Arib Anwar
 * @creationDate: 10th October 2019 10:13
 * @version: 1.0
 * @describtion: This is a class.
 * 				
 * 
 */
public class Magician implements Performer {
	private String magicWords;
	private MagicBox magicBox;
	
	public void perform() {
		System.out.println("Magician says: "+magicWords);
		System.out.println(magicBox.getContents());

	}

	public String getMagicWords() {
		return magicWords;
	}

	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}
	
	public MagicBox getMagicBox() {
		return magicBox;
	}

	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}
}
