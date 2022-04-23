package com.akshay.StudentAdmissionController;


import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"studentSkills","studentAddress"})
@JsonPropertyOrder({"studentDOB","student_Name","studentSkills","studentAddress","studentMobile","studentHobby"})
public class Student {
	
	@JsonProperty("student_Name")//To change property Name
	private String studentName;
	private String studentHobby;
	
	private Long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	//Binding user defined properties of Address class
	private Address studentAddress;
	
	//Generating getters and setters
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	//Generating getters and setters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	
}
