package com.akshay.StudentAdmissionController;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		Calendar cal =Calendar.getInstance();
		@SuppressWarnings("static-access")
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);//gets the day on which request is made.
		if(dayOfWeek == 1) {// 1 means Sunday, 2 means Monday,....7 means Saturday
			
			response.getWriter().write("This website is closed on Sunday; please try accessing it "+
			                          "on any other day!!");
			return false;
		}
		//if this method return true -> application will further handle the request
		//if this method return false -> application will further not handle the request
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//this method would be called after Spring MVC executes the request Handler method for the request
		System.out.println("HandlerInterceptorAdapter : Spring MVC called postHandle method for "
				                                         +request.getRequestURI().toString());
		
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler,Exception ex) throws Exception {
		//this method would be called after the response object is processed by the view for the request
				System.out.println("HandlerInterceptorAdapter : Spring MVC called afterCompletion method for "
						                                         +request.getRequestURI().toString());
		
	}

}
