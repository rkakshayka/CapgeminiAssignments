package generics_assignments;

import java.util.HashMap;
import java.util.Map;

public class GenericQ2 {
    public static void main(String[] args) {
    	//Initializing a HashMap for Integer and Double
        HashMap<Integer, Double> student = new HashMap<>();

        //put method adds the elements
        //adding student (id's, marks) for 10 students.
        student.put(1, 31.6);
        student.put(2, 55.0);
        student.put(3, 30.0); 
        student.put(4, 68.9);
        student.put(5, 40.0);
        student.put(6, 61.3);
        student.put(7, 88.3);
        student.put(8, 60.0);
        student.put(9, 80.0);
        student.put(10, 60.6);
        
        //Iterate the student using for-each loop
        for (Map.Entry<Integer, Double> e : student.entrySet())
            System.out.println("Key(ID) " + e.getKey()
                    +" | "+"Value(Marks) " + e.getValue());
    }    	
}


