package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start thhe container
    	ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
    	//get the bean
    	Patient patient = context.getBean("patient",Patient.class);
    	patient.details();
    }
}
