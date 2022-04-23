package com.Assignment_3;

//import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="/login")
	public ModelAndView login() {
		ModelAndView mav= new ModelAndView("Question_3/Login");
		return mav;
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public ModelAndView verify(@ModelAttribute("user") User user) {
		
		ModelAndView mav;
		System.out.println(user);
		if(user.getUsername().compareTo("Akshay")==0 && user.getPassword().compareTo("1234")==0)
			mav= new ModelAndView("Question_3/Success");
		else
			mav= new ModelAndView("Question_3/Error");
		
		return mav;
	}
}



