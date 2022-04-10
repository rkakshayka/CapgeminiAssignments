package lambda_assignments;

import java.util.ArrayList;
import java.util.List;

public class Lambda_Q4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Akshay");
		list.add("Kaushik");
		list.add("Aditya");
		
		list.removeIf(word -> word.length()%2 != 0);
		
		for (String str : list) {
			System.out.println(str);
		}
	}
}
