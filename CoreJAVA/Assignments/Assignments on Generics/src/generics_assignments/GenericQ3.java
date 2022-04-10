package generics_assignments;

import java.util.ArrayList;
import java.util.Collections;

public class GenericQ3 {
    public static void main(String a[]){
        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(101);
        arrl.add(102);
        arrl.add(103);
        arrl.add(104);
        arrl.add(105);
        arrl.add(106);

        System.out.println("Before Swap ArrayList:");
        for(Integer temp: arrl){
            System.out.println(temp);
        }
        
        System.out.println("-------------------------------------");

        //2nd(index 1) element swapped with the 6th(index 5) element
        Collections.swap(arrl, 1, 5);

        System.out.println("After Swap ArrayList:");
        for(Integer temp: arrl){
            System.out.println(temp);
        }
    }
}
