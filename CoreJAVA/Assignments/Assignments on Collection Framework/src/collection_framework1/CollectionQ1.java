package collection_framework1;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class CollectionQ1 {
    public static void main(String[] args) {
        Long a=Long.valueOf("8888888888");
        Long b=Long.valueOf("9999999999");
        //Long c=Long.valueOf("5555555555");
        //Long d=Long.valueOf("6666666666");
        Contact c1=new Contact(a,"Akshay","akshay272002@gmail.com",Gender.male);
        Contact c2=new Contact(b,"girl1","girl1@gmail.com",Gender.female);
        //contact c3=new contact(c,"girl2","girl2@gmail.com",Gender.female);
        //contact c4=new contact(d,"Kaushik","kaushik@gmail.com",Gender.male);

        TreeMap<Long,Contact> details= new TreeMap<Long,Contact>(Collections.reverseOrder());
        details.put(a,c1);
        details.put(b,c2);
        //details.put(c,c3);
        //details.put(d,c4);
        
        //prints all the keys
        System.out.println("All the Keys: ");
        for (Map.Entry<Long, Contact> entry: details.entrySet()){
            System.out.println(entry.getKey());
        }
        
        //printing all values
        System.out.println("All the Values: ");
        for (Map.Entry<Long, Contact> entry: details.entrySet()){
            System.out.println(entry.getValue());
        }
        
        //prints all key-value pairs
        System.out.println("All Key-Value pairs: ");
        for (Map.Entry<Long, Contact> entry: details.entrySet()){
            System.out.println(entry.getKey()+"|"+entry.getValue());
        }      
    }
}

enum Gender{
    male,female;
}

class Contact{
    private long PhoneNumber;
    private String ContactName;
    private String Email;
    private Gender gender;

    public Contact(long PhoneNumber,String ContactName,String Email,Gender gender){
    	this.PhoneNumber=PhoneNumber;
        this.ContactName=ContactName;
        this.Email=Email;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Phone no: "+PhoneNumber+"Name: "+ContactName+" email: "+Email+"Gender: "+gender;
    }
}
    
