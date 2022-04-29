package io.springboot.security_assignment1.q3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloWorldController {

	@ResponseBody
	@RequestMapping(value="/hello")
	public String hello() {
		return "<h1>Hello World</h1>";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}


