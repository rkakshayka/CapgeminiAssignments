package com.Spring_MVC_Annotations.MultiAction;

//paste this in the web url -> http://localhost:8080/SpringMVCAnnotations/greet/hi
//paste this in the web url -> http://localhost:8080/SpringMVCAnnotations/greet/welcome

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class MultiActionController  {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hello World!..Akshay Kaushik");
		return modelandview;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld() {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi World!..Akshay Kaushik");
		return modelandview;
	}

}

