package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class javaconfig {
	@Bean
	public Doctor doctor() {
		Doctor doctor=new Doctor(101,"lakshmi");
		return doctor;
	}
	
		@Bean
		public Pharmacy pharmacy() {
			Pharmacy pharmacy=new Pharmacy("lakshmi","Hydrabad");
			return pharmacy;
		}
	@Bean
	public Patient patient() {
		Patient patient=new Patient("lakshmi",20,"doctor","Pharmacy");
		return patient;
		
	}

}
