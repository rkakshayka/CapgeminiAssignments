package string_manipulation;

public class StringM {
	public static void main(String[] args) {
		/**Interned way or String Literals
		 * Stored in string pool
		 * str1 and str2 are reference variable. - pointing to same literal
		 * i.e. Hello
		 */
		String str1 = "Hello";
		String str2 = "Hello";
		
		//Here we are not comparing content i.e. Hello
	    //We are comparing Hash Codes for str1 and str2 that will be same for String Hello
		if(str1 == str2) {
			System.out.println("Case-1 : str1 == str2");
		}else {
			System.out.println("str1 != str2");
		}
		
		/**String object i.e. we used new operator.
		 * String object constructed in Heap Area with Hello as its contents.
		 * str3 and str4 are reference variable which are pointing to 2 different
		 * objects whose content is same.
		 */ 
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		//Here we are not comparing content i.e. Hello
	    //We are comparing Hash Codes for str3 and str4 that will be different for
		//String object Hello.
	
		if(str3 == str4) {
			System.out.println("str1 == str2");
		}else {
			System.out.println("Case-2 : str1 != str2");
		}
		
//Conclusion: == will compare reference variables i.e hashCodes and not the real content
// i.e. Hello.
		
		
		//How should we compare Strings ??
		if(str1.equals(str4)) {
			System.out.println("str3 is equals to str4");
		}else {
			System.out.println("str3 not equals to str4");
		}
		
		if(str3.compareTo(str4)==0) {
			System.out.println("str3 compared to str4");
		}else {
			System.out.println("str3 not compared to str4");
		}
		
		
		//String methods
		System.out.println("--------String methods---------");
		
		String str = "Akshay, Aditya, Aryan, All, Are, Kaushik";
		System.out.println("Actual String is : "+str);
		int len = str.length();
		System.out.println("Length of String :"+len);
		System.out.println("Element 1st:"+str.charAt(0)+" | "+"Element Last:"+str.charAt(len-1));
		
		str.toUpperCase();
		// no change because string are immutable.
		System.out.println("Uppercase String : "+str);
		
//method-1		Now we will create new string object
		String s1 = new String(str.toUpperCase());
		System.out.println("Uppercase String : "+s1);

//method-2     We are storing uppercase string in new string s1.
		String s2 = str.toUpperCase();
		System.out.println("Uppercase String : "+s2);
		
//String Manipulation : A new string will be generated but the old string remains same
		//old string never got modified.	
		
		if(str.contains("Akshay")) {
			System.out.println("Akshay is in string");
		}else {
			System.out.println("Akshay is not in the string");
		}
		
		System.out.println("Actual String is : "+str);
		// 5 is the index number(starts from 0) 
		//substring breaks the string from Actual string but Actual string
		//won't change.
		String s3 = str.substring(5);
		System.out.println("s3 is : "+s3);
		
		String s4 = str.substring(8,16);
		System.out.println("s4 is : "+s4);
		
		System.out.println("Actual String is : "+str);
		// to replace in string but actual string remains same.
		String s5 = str.replace('A', 'V');
		System.out.println("s5 is : "+s5);
		
		//To get all the character of a string.
		//we create an array
		char[] chArr1 = str.toCharArray();
		for(char ch : chArr1) {
			System.out.println(ch+" ");
		}
		System.out.println();
		
		String[] strArr =str.split(",");
		for(String s : strArr) {
			//Run only 1 sop
			//System.out.println(s);
			System.out.println(s.trim());
		}
		
		//String Operation
		//Data provided during Registration
		
		String email = "akshay272002,+om";
		//String email = "akshay272002@gmail.com";
		String phone = "9027xxxxx3";
		//String password = "akshay123";
		
		//Validate the details.
		if(!email.isEmpty()) {
			System.out.println("Email is Available");
			if(!email.contains("@") && !email.contains(".")) {
				System.out.println("Email is not a valid Email");
			}else {
				System.out.println("Email is a valid one !!");
			}
		}
		else {
			System.out.println("Pleade Provide an email");
		}
				
		if(!phone.isEmpty()) {
			System.out.println("phone is Available");
			if(phone.length() != 10) {
				System.out.println("phone is not a valid ");
			}else {
				System.out.println("phone is a valid one !!");
			}
		}
		else {
			System.out.println("Pleade Provide an phone");
		}		
		
		
		//Strings are IMMUTABLE
		String string1 = new String("Hello");
		string1.concat("World");//+operator
		//No change
		System.out.println("string is:"+string1);
		
		
		//String Buffer is Thread safe
		//Data is manipulated
		StringBuffer buffer1 = new StringBuffer("Akshay");
		buffer1.append("Kaushik");
		System.out.println("String is appended in Buffer :"+buffer1);
		
		
		//String Builder not thread safe
		StringBuilder builder = new StringBuilder("Akshay");
		builder.append("Kaushik");
		System.out.println("String is appended in Builder :"+builder);
		
	}

}
