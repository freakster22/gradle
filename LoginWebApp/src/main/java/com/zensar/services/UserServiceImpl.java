package com.zensar.services;

import org.springframework.stereotype.Service;

import com.zensar.entities.User;
/**
 * @author Arib Anwar
 * @creationDate: 11th Oct 2019 15:40
 * @version:1.0
 * @description:This is a User Class.
 * 				This is a Business Class.
 *				Using Service Annotation
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(User user) {
		if (user.getUsername().equalsIgnoreCase("Freak") && user.getPassword().equalsIgnoreCase("Arib"))
			return true;
		else
			return false;
	}

}
