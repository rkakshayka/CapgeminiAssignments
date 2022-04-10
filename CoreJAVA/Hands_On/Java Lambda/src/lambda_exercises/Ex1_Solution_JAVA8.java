package lambda_exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex1_Solution_JAVA8  {

	public static void main(String[] args) {
		List<Person> peoples = Arrays.asList(
			//Calling the constructor inside forList
			new Person("Akshay","Kaushik",20),
			new Person("Aditya","Kaushik",19),
			new Person("Shay","Hik",18),
			new Person("Aks","Shik",27)
		);
		
		
		//Step 1: Sort list by name.
		Collections.sort(peoples, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));
			
		
		//Step 2: Create a method that prints all elements in the list.
		System.out.println("Print all Persons");
		printConditionally(peoples, p -> true);
		
		//Step 3: create a method that prints all people that have last name beginning with H.
		System.out.println("Printing all persons with last name begin with H");
		printConditionally(peoples, p -> p.getLastname().startsWith("H"));
		
		System.out.println("Printing all persons with first name begin with S");
		printConditionally(peoples, p -> p.getFirstname().startsWith("A"));
		
	}
	
	private static void printConditionally(List<Person> peoples, Condition condition) {
			for(Person p : peoples) {
				if(condition.test(p)) {
					System.out.println(p);
				}
			}
	}
}