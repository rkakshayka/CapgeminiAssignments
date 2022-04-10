package lambda_assignments;

import java.util.HashMap;

public class Lambda_Q7 {
    public static void main(String[] args) {
        StringBuilder mix=new StringBuilder();
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Welcome");
        map.put(2,"to");
        map.put(3,"my");
        map.put(4,"World");
        //this method will make the key value pairs a string using string builder
        map.entrySet().forEach(t -> mix.append(t));
        System.out.println(mix);
    }
}
