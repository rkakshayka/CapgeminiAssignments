package oops_assignments;

public class OOPS_Q3 {
    public static void main(String args[]) {

    	CurrentAcccount m = new CurrentAcccount();
        SavingAcoount s = new SavingAcoount();

        m.totalMoneyInBank(); //prints total money in current account
        s.totalMoneyInBank(); //prints total money in savings account
        
        double Overall_Money = (m.fixedDeposits)+(m.cashCredit);
        System.out.println("Total money in the bank:"+Overall_Money); 
    }
}

class Bank{
    void totalMoneyInBank(){}
}

class SavingAcoount extends Bank{
    float fixedDeposits =150000;
    void totalMoneyInBank()
    {
        System.out.println("Total money in savings account: " +(fixedDeposits));
    }
}
class CurrentAcccount extends SavingAcoount{
    double cashCredit=59000;
    void totalMoneyInBank()
    {
        System.out.println("Total money in current account: "+(cashCredit));
    }
}
