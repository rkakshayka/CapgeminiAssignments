package lambda_exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex1_Person {

	public static void main(String[] args) {
		List<Person> peoples = Arrays.asList(
			//Calling the constructor inside forList
			new Person("Akshay","Kaushik",20),
			new Person("Aditya","Kaushik",19),
			new Person("Shay","Hik",18),
			new Person("Aks","Shik",27)
		);
		
		
		//Step 1: Sort list by name.
		Collections.sort(peoples, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastname().compareTo(p2.getLastname());
			}
		});
		
		//Step 2: Create a method that prints all elements in the list.
		printAll(peoples);
		
		//Step 3: create a method that prints all people that have last name beginning with H.
		printConditionally(peoples, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastname().startsWith("H");
			}
		});
		
/**      printConditionally(peoples, new Condition() {
        	@Override
			public boolean test(Person p) {
				return p.getFirstname().startsWith("S");
			}
		});	
*/
	}
	
	private static void printConditionally(List<Person> peoples, Condition condition) {
			for(Person p : peoples) {
				if(condition.test(p)) {
					System.out.println(p);
				}
			}
	}
	
	private static void printAll(List<Person> peoples) {
		for(Person p : peoples) {
			System.out.println(p);
		}
	}

}

interface Condition {
	boolean test(Person p);
}