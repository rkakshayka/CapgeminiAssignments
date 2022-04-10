package generics_assignments;

import java.util.Date;

public class GenericQ4b {
    public static void main(String[] args) {
    	//creating dateObj object of type Date
        Date dateObj = new Date();
        pair<String, java.util.Date> object1 = new pair<String,java.util.Date> ("1",dateObj);
        System.out.println("Key: "+object1.getKey()+"|"+"Value: "+object1.getValue());
        
        /**
        pair<String, java.util.Date> object2 = new pair<String,java.util.Date> ("2",dateObj);
        System.out.println("Key: "+object2.getKey()+"|"+"Value: "+object2.getValue());
        **/
        
    }
}


