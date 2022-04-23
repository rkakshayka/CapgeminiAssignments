package com.akshay.StudentAdmissionController;
//enter this link in web url -> 
//   http://localhost:8080/SpringREST_HandsOn/admissionFORM.html

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;


import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;

//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy**MM**dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		
		binder.registerCustomEditor(String.class, "studentName",new StudentNameEditor());
		
	}
	
	@RequestMapping(value="/admissionFORM.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception {
		
		String exceptionOccured = "ARITHMETIC_EXCEPTION";
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("Null Pointer Exception");
		} else if(exceptionOccured.equalsIgnoreCase("IO_EXCEPTION")) {
			throw new IOException("IO Exception");
		} else if(exceptionOccured.equalsIgnoreCase("ARITHMETIC_EXCEPTION")) {
			throw new ArithmeticException("Arithmetic Exception");
		}
		
		ModelAndView model1 = new ModelAndView("Student_Files/AdmissionForm");
		return model1;
	}
	
	@ModelAttribute
	public void addingCommonObject(Model model1) {
		model1.addAttribute("AdmissionSuccessMesssage","Lovely Professional University,INDIA");
	}
	
	@RequestMapping(value="/submitAdmissionFORM.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result) {
		
		if (result.hasErrors()) {
			ModelAndView model1 = new ModelAndView("Student_Files/AdmissionForm");
			return model1;
		}
		ModelAndView model = new ModelAndView("Student_Files/AdmissionSuccess");
		//model.addObject("AdmissionSuccessMesssage", "Lovely Professional University,INDIA");
		
		return model;
	}
	

}
