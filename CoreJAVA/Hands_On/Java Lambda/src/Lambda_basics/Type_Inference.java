package Lambda_basics;

public class Type_Inference {
	public static void main(String[] args) {
		//using inline
		printLambda(s -> s.length());
		//Only for one-liner 
		//StringLengthLambda myLambda = s -> s.length();
		//System.out.println(myLambda.getLength("Akshay kaushik"));
		
		//StringLengthLambda myLambda = (String s) -> s.length();
	}
	
	public static void printLambda(StringLengthLambda L) {
		System.out.println(L.getLength("Akshay kaushik"));
	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}

}
