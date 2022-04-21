package com.SpringCore_Question7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCore_Q7{

	public static void main( String[] args ){
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Number n1=(Number)ctx.getBean("number");
		System.out.println(n1);
	}
}