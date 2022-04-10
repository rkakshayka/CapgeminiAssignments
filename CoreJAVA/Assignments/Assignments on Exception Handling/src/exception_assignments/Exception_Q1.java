package exception_assignments;
import java.util.Scanner;

//Arithmetic Exception
public class Exception_Q1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Plz enter X value: ");
        int x = input.nextInt();

        System.out.println("Plz enter Y value: ");
        int y = input.nextInt();
        int a;
        try {
            a = x / y;
            System.out.println("Value of A:" + a);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by integer 0 " + e);
        }
        if (y == 0) {
            System.out.println("EXCEPTION IS HANDLED");
        }
        
        input.close(); 
    }
}
