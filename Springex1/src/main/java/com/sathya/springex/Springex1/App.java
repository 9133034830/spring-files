package com.sathya.springex.Springex1;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start the container
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
    System.out.println("*********");
    Greetingimpl greetingimpl=context.getBean("greet",Greetingimpl.class);
    greetingimpl.greet();
    }
}
