package in.SpringMaven.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
	    Triangle triangle = (Triangle) context.getBean("TRIANGLE");
	    triangle.draw();
	}
}
