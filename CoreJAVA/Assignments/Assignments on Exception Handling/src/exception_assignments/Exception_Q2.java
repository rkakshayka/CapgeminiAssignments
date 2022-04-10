package exception_assignments;

import java.util.Scanner;
public class Exception_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.printf("Enter the numerator and denominator: ");
            int n = sc.nextInt();
            int d = sc.nextInt();
            try{
                double q=divide(n, d);
                System.out.println("The quotient is: "+q);
            }
            catch (UnsupportedOperationException e) {
            System.out.printf("Can't divide by zero");
        }
            
       sc.close();     
    }
    
    public static double divide(int n, int d) throws UnsupportedOperationException{
        if(d==0){
            throw new UnsupportedOperationException("Exception");
        }
        return n / d;
    }
    

}
@SuppressWarnings("serial")
class UnsupportedOperationException extends Exception{
    UnsupportedOperationException(String exception){
        super(exception);
    }
}
