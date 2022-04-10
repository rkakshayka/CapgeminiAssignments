package lambda_assignments;
import java.util.Scanner;

interface acceptance{
    void decision(int a,int b);
}

public class Lambda_Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the price of the order");
        
        int price=sc.nextInt();
        System.out.println("Enter the status of order: 1} Accepted 2} Ordered");
        
        int status= sc.nextInt();
        acceptance determine = (c,v) -> {
            if(c>10000 && v==1){
                System.out.println("Your order of amount "+price+" is accepted and completed");
            }
            else if(c<10000){
                System.out.println("The amount of order is not processable");
            }
            else{
                System.out.println("Your order's status is ambiguous right now");
            }
        };
        determine.decision(price,status);

        sc.close();
    }    
}
