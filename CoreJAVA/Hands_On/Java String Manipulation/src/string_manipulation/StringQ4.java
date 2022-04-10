package string_manipulation;

import java.util.Scanner;

//WAP to capitalize first letter of each word present in string.
public class StringQ4 {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the statement: ");
		String str = sc.nextLine();
		String uprCase = "";
		//this is for the new line which is generated after conversion.
		Scanner strScan = new Scanner(str);
		while(strScan.hasNext())
		{
			String word = strScan.next();
			uprCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		//Print original line with output
		System.out.println("Original String is: " + str);
		//trim is used to trim the white spaces.
		System.out.println("Sentence after convert: "+ uprCase.trim());
		
		sc.close();
		strScan.close();
		
	}

}
