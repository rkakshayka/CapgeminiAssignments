package com.Spring_MVC_Annotations.Path_Variable;

import java.util.Map;

//paste this in the web url -> http://localhost:8080/SpringMVCAnnotations/welcome/{CountryName}/{UserName}
// or this -> http://localhost:8080/SpringMVCAnnotations/welcome/INDIA/Akshay
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathVariable_Annotation  {
	//{End user can change details}
	@RequestMapping("/welcome/{CountryName}/{UserName}")
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars) {
		
		String Name = pathVars.get("UserName");
		String Country = pathVars.get("CountryName");
		
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hello " + Name + " You Are from " + Country);
		return modelandview;
	}

}

