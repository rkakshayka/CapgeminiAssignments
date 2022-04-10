package string_manipulation;

import java.util.Scanner;

public class StringQ2 {
	public static void main(String[] args) {
		//creating an input object sc of type Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String: ");
		String firstStr = sc.next();
		
		System.out.println("Enter Second String: ");
		String secondStr =sc.next();
		
		System.out.println("Result After Concatenation:");
		System.out.println(firstStr+" "+secondStr);
		
		sc.close();
	}

}