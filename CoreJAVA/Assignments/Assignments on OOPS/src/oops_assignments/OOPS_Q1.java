package oops_assignments;
//A singleton class can have only one object
class Singleton
{
	private static Singleton obj=new Singleton();
	public String s;
	private Singleton() {
		s = "This is Singleton class";
	}
	public static Singleton getInstance(){
		return obj;
	}
}

public class OOPS_Q1 {
		public static void main(String[] args) {
		Singleton x=Singleton.getInstance();
		System.out.println(x.s);
		}
	}