package com.akshay.StudentAdmissionController;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class GlobalExceptionHandlerMethods {

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		//logging Null Pointer Exception
		System.out.println("Null Pointer Exception Occured: "+e);
		
		return "NullPointerException";
		
	}
	
	@ExceptionHandler(value = IOException.class)
	public String handleIOException(Exception e) {
		//logging unknown generic Exception
		
		System.out.println("IO Exception Occured: "+e);
		return "IOException";
		
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		//logging IO Exception
		
		System.out.println("Unknown Exception Occured: "+e);
		
		return "Exception";
	}

}
