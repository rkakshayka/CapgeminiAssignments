package string_manipulation;

public class StringQ1 {
	public static void main(String[] args) {
		String str = "Welcome to Home";
		String[] strArray = str.split(" ");
		System.out.println(strArray);
		
		for (String temp : strArray) {
			System.out.println(temp);
		}
		
		for(int i=0;i<3;i++) {
			char[] s1 =strArray[i].toCharArray();
			for(int j=s1.length-1;j>=0;j--) {
				System.out.println("\t"+s1[j]);
			}
			System.out.println("");	
		}
	}

}
