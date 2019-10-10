package com.zensar.spring.replacers;
/**
 * @author Arib Anwar
 * @creationDate: 10th October 2019 10:44
 * @version: 1.0
 * @describtion: A new class is created for Method Injection
 * 				Implementing Method Replacer of Spring
 * 				Contains the object of the class you want to change.
 */
import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MagicBoxReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		return "Spider-Man";
	}

}
