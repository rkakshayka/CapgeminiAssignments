package com.SpringCore_Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
		SpringCore_Q2 c=(SpringCore_Q2)ctx.getBean("questions");
		c.displayList();
		c.displaySet();
		c.displayMap();
	}

}
