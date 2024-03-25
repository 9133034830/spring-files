package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class Student {
	@Autowired
	private EmailSrvice emailservice;
	@Autowired
	private JavaCourseService javaCourseservice;
	

	public void details() {
		emailservice.message();
		javaCourseservice.corseInfo();
	}
		
	}
