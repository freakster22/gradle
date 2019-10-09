package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;

/**
 * @author Arib Anwar
 * @creationDate: 9th October 2019 17:02
 * @version: 1.0
 * @describtion: This is an class.
 * 				It implements performer
 * 				Using @Component to mark as Bean Class.
 */
@Component("slash")
public class Instrumentalist implements Performer {
	@Autowired //Autowire can only be used for Complex Types.
	@Qualifier("flute")
	private Instrument instrument;
	@Value("Rapsody")
	private String song;


	

	




	



	


	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Song being played is "+song);
		instrument.play();
	}

}
