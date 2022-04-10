package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Teacher vasudha = new Teacher(1,"Vasudha",700);
		Teacher ashu = new Teacher(2,"Ashu",600);
		Teacher sheetal = new Teacher(3,"Sheetal",700);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(vasudha);
		teacherList.add(ashu);
		teacherList.add(sheetal);
		
		Student akshay = new Student(1,"Akshay Kaushik",12);
		Student aditya = new Student(2,"Aditya Kaushik",12);
		Student aryan = new Student(3,"Aryan Kaushik",10);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(akshay);
		studentList.add(aditya);
		studentList.add(aryan);
		
		School tss = new School(teacherList,studentList);
		//System.out.println("TSS has earned $"+ tss.getTotalMoneyEarned());
		
		//student paid fees so tss earn money.
		akshay.payFees(5000);
		System.out.println("TSS has earned $"+ tss.getTotalMoneyEarned());
		
		aditya.payFees(6000);
		System.out.println("TSS has now earned $"+ tss.getTotalMoneyEarned());
		
		aryan.payFees(6000);
		System.out.println("TSS has earned till now $"+ tss.getTotalMoneyEarned());
		
		System.out.println("----------TSS Schol Pays salary to Teachers----------");
		
		vasudha.receiveSalary(vasudha.getSalary());
		System.out.println("TSS has spent for salary to "+ vasudha.getName()+" and now has $"
				+ tss.getTotalMoneyEarned());
		
		ashu.receiveSalary(ashu.getSalary());
		System.out.println("TSS has spent for salary to "+ ashu.getName()+" and now has $"
				+ tss.getTotalMoneyEarned());
		
		sheetal.receiveSalary(sheetal.getSalary());
		System.out.println("TSS has spent for salary to "+ sheetal.getName()+" and now has $"
				+ tss.getTotalMoneyEarned());
		
		System.out.println(akshay);
		
		//TSS school again paid to vasudha
		vasudha.receiveSalary(vasudha.getSalary());
		System.out.println(vasudha);
	}
}
