package lambda_assignments;
 
interface Lambda {
	public void ArithmeticOperations();
}

public class Lambda_Q1 {
	public static void main(String[] args) {
		int x = 66, y = 15;
		
		Lambda add = () ->{
			int sum = x + y;
			System.out.println("Addition is "+sum);
			System.out.println("-------------------------");
		};
		
		Lambda subtract = () ->{
			int subt = x - y;
			System.out.println("Subtraction is "+subt);
			System.out.println("-------------------------");
		};
		
		Lambda multiply = () ->{
			int product = x * y;
			System.out.println("Multiplication is "+product);
			System.out.println("-------------------------");
		};
		
		Lambda divide = () ->{
			int quotient = x / y;
			System.out.println("Division results "+quotient+" as quotient");
		};	

		System.out.println("Calling Lambda Expressions...");
		System.out.println("-------------------------");
		add.ArithmeticOperations();
		subtract.ArithmeticOperations();
		multiply.ArithmeticOperations();
		divide.ArithmeticOperations();
	
	}
}