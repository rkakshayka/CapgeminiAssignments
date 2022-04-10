package string_manipulation;
//wap to prove a string is immutable. 
public class StringQ10 {
	public static void main(String[] args) {
		//"Akshay" string created in pool and reference assigned to s1
		String s1 = "Akshay";
		
		//s2 also having same reference to "Akshay" in the pool
		String s2 = s1;
		
		//Proof that they have same reference
		System.out.println(s1==s2);
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = "Learning";
		//s1 value changed above, so how strings are immutable?
		
		//in above case a new string "Learning" got created in the pool.
		//s1 is now referring to the new string in the pool.
		//But original string "Akshay" in the pool is still unchanged 
		//s2 is still referring to the original string "Akshay"
		
		
		//proof that s1 and s2 have different reference
		System.out.println(s1==s2);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
