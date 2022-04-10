package generics_assignments;

import java.util.HashSet;

public class GenericQ1 {
    public static void main(String[] args) {
        HashSet<employee> details= new HashSet<employee>();
        employee e1 = new employee(100,"Akshay",40000,"Devloper");
        employee e2 = new employee(101,"Kaushik",30000,"Banking");
        employee e3 = new employee(103,"Aditya",38000,"Defence");
        details.add(e1);
        details.add(e2);
        details.add(e3);
 
        //Prints all the details of employees
        System.out.println(details);
    }
}

class employee{
    int id;
    int salary;
    String name;
    String dept;
    
    public employee(int id, String name, int salary, String dept){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    
    //Source-> Generate toString.

    @Override
    public String toString(){
        return "{ID: "+id+" Name: "+name+" Salary: "+salary+" Department: "+dept+"}";
    }
     
}
