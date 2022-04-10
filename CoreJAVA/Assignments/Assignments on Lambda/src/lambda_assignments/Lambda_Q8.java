package lambda_assignments;

import java.util.ArrayList;

public class Lambda_Q8 {
    public static void main(String[] args) {
        thread execute = new thread();
        System.out.println(Thread.currentThread());
        execute.start();
    }
}

class thread extends Thread{
    public void run(){
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(6);
        numberList.add(100);
        numberList.add(66);
        numberList.add(01);
        numberList.add(12);
        //This will print the array list using a consumer function
        numberList.forEach(t -> System.out.println(t));
    }
}
