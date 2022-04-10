package exception_assignments;

public class Exception_Q3 {
	public static void main(String[] args) {
		Savings s = new Savings();
	    s.deposit(10000);
	    s.withdraw(1000);
		s.withdraw(100000);
		s.withdraw(-100000);
	}
}

class InsufficientBalanceException extends Exception {
	private static final long serialVersionUID = 1L;

	InsufficientBalanceException(String s) {
        System.out.println("Insufficient Balance");
    }
}

class IllegalBankTransactionException extends Exception {
	private static final long serialVersionUID = 1L;

	IllegalBankTransactionException(String s) {
        System.out.println("IllegalBankTransaction");
    }
}

class Savings {
    public long id;
    public double balance;
    
    public void withdraw(double amount) {
        try {
            if(amount > balance || balance == 0) {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            else if(amount < 0) {
                throw new IllegalBankTransactionException("IllegalBankTransaction");
            }
            else {
                balance = balance - amount;
                System.out.println("Remaining Balance: "+balance);
            }
        }catch(InsufficientBalanceException e) {
            System.out.println(e);
        }catch(IllegalBankTransactionException e) {
            System.out.println(e);
        }
        
    }
    
    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Current Balance: "+balance);
    }
}

