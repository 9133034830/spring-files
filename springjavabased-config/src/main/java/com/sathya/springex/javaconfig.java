package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration


public class javaconfig {
	@Bean
	public GreetingImpl greet()
	{
		GreetingImpl greetingImpl=new GreetingImpl();
		return  greetingImpl;
	}

}
