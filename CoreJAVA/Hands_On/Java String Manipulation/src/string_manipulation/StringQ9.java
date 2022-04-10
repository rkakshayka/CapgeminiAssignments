package string_manipulation;

import java.util.Scanner;

//Wap to swap 2 strings without using a third variable.
public class StringQ9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the second String: ");
		String str2 = sc.nextLine();
		
		System.out.println("Before Swap: " + str1 + " " + str2);
		str1 = str1 + str2;
		str2 =str1.substring(0,str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After: "+ str1 + " " + str2);
		
		sc.close();
	}
	

}
