package string_manipulation;

public class StringBufferandBuilder {
	public static void main(String[] args) {
		//StringBuffer and Builder 
		//StringBuffer sb = new StringBuffer("Welcome");
		//sb.append(" Home");
		
		StringBuilder sb1 = new StringBuilder("Welcome");
		sb1.append(" Home");
		System.out.println(sb1);
		
		//will insert at 7 index
		sb1.insert(7, " to");
		System.out.println(sb1);
		
		sb1.replace(11, 15, "World");
		System.out.println(sb1);
		
		sb1.delete(7, 16);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
	}

}
