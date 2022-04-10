package lambda_assignments;

import java.util.ArrayList;
import java.util.List;

public class Lambda_Q6 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("India");
		list.add("America");
		list.add("Australia");
		list.add("Britain");
		
		list.replaceAll(word -> word.toUpperCase());
		
		for (String str : list) {
			System.out.println(str);
		}
	}

}

