
public class Animal {
	int age;
	String gender;
	int weightInKg;
	
	//we are passing arguments in constructor
	public Animal(int age, String gender, int weightInKg) 
	{
		this.age = age;
		this.gender = gender;
		this.weightInKg = weightInKg;
	}
	
	//Now we are creating some methods in class
	public void eat() {
		System.out.println("eating..");
	}
	
	public void sleep() {
		System.out.println("sleeping..");
	}

}
