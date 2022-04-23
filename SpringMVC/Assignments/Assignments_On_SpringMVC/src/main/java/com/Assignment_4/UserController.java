package com.Assignment_4;

//import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	private User user;
	
	@RequestMapping(value="/register")
	public ModelAndView register() {
		ModelAndView mav= new ModelAndView("Question_4/Registration");
		return mav;
	}
	
	@RequestMapping(value="/submitReg", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user") User user) {
		this.user=user;
		System.out.println(user);
		ModelAndView mav= new ModelAndView("Question_4/Login");
		return mav;
	}
	 
	
	@RequestMapping(value="/submitLog", method=RequestMethod.POST)
	public ModelAndView verify(@ModelAttribute("user") User user) {
		
		ModelAndView mav;
		System.out.println(user);
		if(user.getUsername().compareTo(this.user.getUsername())==0 && user.getPassword().compareTo(this.user.getPassword())==0)
			mav= new ModelAndView("Question_4/Success");
		else
			mav= new ModelAndView("Question_4/Error");
		
		return mav;
	}
}



