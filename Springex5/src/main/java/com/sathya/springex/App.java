package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    //start the container
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
       //get the bean
     
      Person person = context.getBean("person",Person.class);
      person.info();
      System.out.println("***********");
       
       
       
    }
}
