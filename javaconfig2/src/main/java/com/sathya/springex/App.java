package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start the container
    	ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig2.class);
    	//get bean
    	 Person person1=context.getBean("person1",Person.class);
    	//Person.personInfo();
    	 person1.personInfo();
    	
    }
}
