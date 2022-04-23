package com.akshay.StudentAdmissionController;

//Spring REST WORKING STARTED ------>
//  http://localhost:8080/SpringREST_HandsOn/students
import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class StudentInfoRESTController {	
//---------Retrieving All Students Records from the DataBase.---------------------------------
	
	@RequestMapping(value="/students", method = RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public ArrayList<Student> getStudentList(){
		Student student1 =new Student();
		student1.setStudentName("Akshay Kaushik");
		
		Student student2 =new Student();
		student2.setStudentName("Kaushik");
		
		Student student3 =new Student();
		student3.setStudentName("Aditya Kaushik");
		
		ArrayList<Student> studentsList = new ArrayList<Student>();
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		
		return studentsList;
		
	}
	
//---------Retrieving 1 Student Records from the DataBase.----------------------------
	
		@RequestMapping(value="/students/{name}", method = RequestMethod.GET)
		public Student getStudent(@PathVariable("name") String studentName){
			
			//fetch the student's record using "studentName" from DATABASE
			Student student = new Student();
			student.setStudentName(studentName);
			student.setStudentHobby("Coding");
			
			return student;
		}
		
//----------Updating Student's	Record ------------------------------------------------
		@RequestMapping(value="/students/{name}", method = RequestMethod.PUT, consumes=MediaType.APPLICATION_XML_VALUE)
		public ResponseEntity<Boolean> updateStudent(@PathVariable("name") String studentName, @RequestBody Student student) {
			
			System.out.println("Student Name: "+studentName);
			System.out.println("Student Name: "+student.getStudentName()+
					           "Student Hobby: "+student.getStudentHobby());
			
			//find the matching student record using "studentName" from the DATABASE
			//update the matching student record with the info sent by the client
			
			//return true if update is successful otherwise false
			
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.add("key1","value1");
			httpHeaders.add("key2","value2");
			return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.OK);
		
		}
//-----------------posting a Student Record-------------------------------		
		@RequestMapping(value="/students", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Boolean> postStudent(@RequestBody Student student) {
			System.out.println("Student Name: "+ student.getStudentName()
			                   +"Student Hobby: "+ student.getStudentHobby());
			
			//insert the student record into the database
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.add(
					"Location",
					ServletUriComponentsBuilder.fromCurrentRequest()
					          .path("/{name}")
					          .buildAndExpand(student.getStudentName()).toUri()
					          .toString());
		    return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.CREATED);
		}
//-----------Deleting a student Record---------------------------------------------
		@RequestMapping(value="/students/{name}", method = RequestMethod.DELETE)
		public ResponseEntity<Boolean> deleteStudent(@PathVariable("name") String studentName) {
			System.out.println("Student Name: "+studentName);
			
			//delete the student from the database
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}
//---------------------------Delete ALl Students----------------------------------		
		@RequestMapping(value="/students", method = RequestMethod.DELETE)
		public ResponseEntity<Boolean> deleteAllStudent() {
			
			
			//delete all student from the database
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}
}
