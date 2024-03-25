package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component

public class JavaCourseService implements CourseService{

	@Override
	public void corseInfo() {
		System.out.println("your course name is jav");
		System.out.println("check it once");
		
	}

}
