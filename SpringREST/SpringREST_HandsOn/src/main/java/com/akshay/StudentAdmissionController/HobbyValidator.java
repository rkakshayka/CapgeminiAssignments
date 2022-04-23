
package com.akshay.StudentAdmissionController;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//A validator class used by a custom annotation - always implements the ConstraintValidator interface
//and override two of its methods (with the name - initialize and isValid)
public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
	
	private String listOfValidHobbies;
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		this.listOfValidHobbies=isValidHobby.listOfValidHobbies();
	}
	
	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		if(studentHobby == null) {
			return false;
		}
		
		if(studentHobby.matches(listOfValidHobbies)) {
			return true;
		}else {
			return false;
		}
	}

}
