package string_buffer_builder;

public class CString {
	public static void main(String[] args) {
		//Question 1 
		String str = "Hello World";
		System.out.println("Actual String is : "+str);
		int len = str.length();
		System.out.println("Length of String : "+len);
		
		//Question 2
		String str1 = "Hello,";
		String str2 = "How are you?";
		
		String join = str1.concat(str2);
		System.out.println("Strings after joined : "+join);
		
		//Question 3
		String string = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("Original String is : "+string);
		
		//a. Print the string to console in lowercase.
		String sLw = new String(string.toLowerCase());
		System.out.println("Lowercase String : "+sLw);
		
		//b. Print the string to console in uppercase
		String sUp = new String(string.toUpperCase());
		System.out.println("Uppercase String : "+sUp);
		
		//c. Replace all ‘a’ character in the string with $ sign
		String repl = new String(string.replace("a", "$"));
		System.out.println("String after replacing a to $ : "+repl);
		
		//d. Check if the original String contains the word “collection”
		System.out.println("Original String is : "+string);
		if(string.contains("collection")) {
			System.out.println("collection is in string");
		}else {
			System.out.println("collection is not in the string");
		}
		//e. Check if the following String “java string pool refers to collection of strings which 
		     //are stored in heap memory” matches the original.
		
		if(sLw == string) {
			System.out.println("Case1: sLw == string");
		}else {
			System.out.println("Case1: sLw != string");
		}
		
		//f. If the string does not match check if there is another method which can be used to 
		     //check if the strings are equal. 
		System.out.println(sLw.equals(string));
		
		//Here we are ignoring case-> uppercase  
		if(sLw.equalsIgnoreCase(string)) {
			System.out.println("Case2: sLw == string");
		}else {
			System.out.println("Case2: sLw != string");
		}
		
			
	}

}
