package generic_handson;

import java.util.ArrayList;
import java.util.List;

import generic_hands_on.MyGenericClass;
import generic_hands_on.MyGenericClass2;

public class clGeneric {
	public static void main(String[] arg) {
		
//MyGenericClass contents Starts in main methods
		
		//Created an object of MyGenericClass
		MyGenericClass<Integer> obj1 = new MyGenericClass<>();
		
		//Creating a list of integer type
		List<Integer> list1 = new ArrayList<>();
		//Now Adding some element in the list
		list1.add(100);
		list1.add(101);
		list1.add(103);
		
		obj1.setList(list1);
		List<Integer> list = obj1.getList();
		//for iterating
		list.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		//Created another object of MyGenericClass
	    MyGenericClass<String> obj2 = new MyGenericClass<>();
	    //Creating a list of String type
	    List<String> list2 = new ArrayList<>();
	  	//Now Adding some element in the list
	  	list2.add("Akshay");
	  	list2.add("Kaushik");
	  	list2.add("Aditya");
	  	
	  	obj2.setList(list2);
	  	//Method chaining
		obj2.getList().forEach(System.out::println);
//MyGenericClass contents Ends in main methods		
		
		System.out.println("---------------------------------------------");

//MyGenericClass2 contents Starts in main methods		
		MyGenericClass2<Integer,String> class2Obj1 = new MyGenericClass2<Integer,String> (1001,"Ak");
		System.out.println(class2Obj1.getKey()+"\t"+class2Obj1.getValue());
		
		//in java 8 no need to specify Type on right side
		MyGenericClass2<String,Integer> class2Obj2 = new MyGenericClass2<> ("RK",1002);
		System.out.println(class2Obj2.getKey()+"\t"+class2Obj2.getValue());

//MyGenericClass contents Ends in main methods		
		
	}

}
