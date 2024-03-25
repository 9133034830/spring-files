package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class javaconfig {
	@Bean
	public Person person() {
		Person person=new Person("ram","ram@gmail.com");
		
		return person;
		
	}

}
