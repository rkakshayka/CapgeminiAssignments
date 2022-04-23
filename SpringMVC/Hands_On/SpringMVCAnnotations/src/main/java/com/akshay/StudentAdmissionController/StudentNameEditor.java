package com.akshay.StudentAdmissionController;

import java.beans.PropertyEditorSupport;


public class StudentNameEditor extends PropertyEditorSupport {
	
	//when we will submit the application form
	//Spring MVC will run setAsText function of this class 
	//Before performing data binding task for studentName property of student object.
	@Override
	public void setAsText(String studentName)throws IllegalArgumentException{
		if(studentName.contains("Mr.") || studentName.contains("Ms.")){
			setValue(studentName);
		}else {
			studentName ="Ms."+studentName;
			setValue(studentName); //every value we provide to setValue-->
			//Spring MVC will use same value to perform data binding task for student property
		}
	}

}
