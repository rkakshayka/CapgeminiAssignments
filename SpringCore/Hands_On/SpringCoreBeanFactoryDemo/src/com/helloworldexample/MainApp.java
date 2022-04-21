package com.helloworldexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring-config.xml"));
		HelloWorld obj = (HelloWorld) factory.getBean("helloAkshay");
	    obj.getMessage();
	}

}
