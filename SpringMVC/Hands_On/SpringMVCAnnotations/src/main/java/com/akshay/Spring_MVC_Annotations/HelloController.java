package com.akshay.Spring_MVC_Annotations;

//paste this in the web url -> http://localhost:8080/SpringMVCAnnotations/welcome


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController  {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hello World!..Akshay Kaushik");
		return modelandview;
	}

}

