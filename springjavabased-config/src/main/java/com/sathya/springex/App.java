package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start the container
    	ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
    	System.out.println("******");
    	//get the bean
    	GreetingImpl greetingimpl=context.getBean("greet",GreetingImpl.class);
    	greetingimpl.greet();
    	
    }
}
