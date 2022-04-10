package Lambda_basics;

public class basicLambda {	
	public static void main(String[] args) {
		//myLambdaFunction is an expression of type Lambda interface.
	    Lambda myLambdaFunction = () -> System.out.println("Hello World!");
	    myLambdaFunction.print();
	    
	    //Annonymous inner class 
	    Lambda innerClassLambda = new Lambda() {
	    	public void print() {
	    		System.out.println("Inner class Hello World");
	    	}
	    };
	    
	    innerClassLambda.print();
	}
}

interface Lambda {
	void print();
}
