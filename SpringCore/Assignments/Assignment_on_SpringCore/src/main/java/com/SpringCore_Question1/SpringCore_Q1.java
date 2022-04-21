package com.SpringCore_Question1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
public class SpringCore_Q1 {

	public static void main(String[] args) {
		
        @SuppressWarnings("resource")
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("SpringConfig.xml");
        Customer customer = (Customer) context.getBean("Customer");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        customer.showDetails();
    }
}
