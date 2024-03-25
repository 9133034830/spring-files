package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component

public class EmailSrvice implements MessageService {

	@Override
	public void message() {
		System.out.println("your email created successfully");
		System.out.println("check your email");
	}
	

}
