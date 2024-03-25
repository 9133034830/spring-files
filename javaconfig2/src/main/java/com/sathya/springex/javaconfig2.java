package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public  class javaconfig2 {
	@Bean
	public  Person person1()
	
	{
		
		Person person=new Person();
		person.setName("lakshmi");
		person.setEmail("lakshmi@gmail.com");
		return person;
	}

}
