public class Human {
	//Objects or Attributes of a class
	String name;
	int age;
	int heightInFeets;
	String eyeColor;
	
	//We are defining constructor method which have same
	// name as of class.
	public Human() {
		
	}
	// Now Defining Methods inside class
	public void speak() 
	{
		System.out.println("Hello, My name is "+name);
		System.out.println("I'm"+heightInFeets+"inches tall.");
		System.out.println("I'm"+age+"years old");
		System.out.println("my eye color is"+eyeColor);
	}
	
	//Now Defining another methods inside class
	public void eat() 
	{
		System.out.println("eating..");
	}
	
	public void walk()
	{
		System.out.println("walking..");
	}
	
	public void read()
	{
		System.out.println("reading..");
	}

}
