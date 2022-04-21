package com.SpringCore_Question8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCore_Q8 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        ((ConfigurableApplicationContext) context).registerShutdownHook();
        Student obj = (Student) context.getBean("student");
        obj.getDetails();
    }
}
 

