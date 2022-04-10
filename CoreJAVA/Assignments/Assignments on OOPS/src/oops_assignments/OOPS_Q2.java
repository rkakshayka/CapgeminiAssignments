package oops_assignments;

public class OOPS_Q2 {
    public static void main(String args[]){
    	Employee e1 = new Employee();
        Labour l1 = new Labour();
        Manager m1 =new Manager();
        
        e1.totalSalary();  //prints employees incremented salary
        m1.totalsalary(); //prints manager salary
        l1.totalsalary(); //prints labor salary
        
        //Total salary of Employees
        double OverallSalary = (m1.salary+ (((m1.incentive)+ l1.overtime))+ l1.salary);
        System.out.println("Total Salary Of Employees: "+OverallSalary);
    }
}

class Employee{
    float salary = 40000;
    void totalSalary()
    {
        System.out.println("Employee incremented salary: "+(salary));
    }
}

class Manager extends Employee{
    float incentive = 15000;
    void totalsalary()
    {
        System.out.println("Manager salary: "+(salary+incentive));
    }
}

class Labour extends Manager{
    double overtime=6500;
    void totalsalary()
    {
        System.out.println("Labour salary: "+(overtime+salary));
    }
}
