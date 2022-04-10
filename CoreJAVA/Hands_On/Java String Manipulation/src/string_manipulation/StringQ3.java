package string_manipulation;
//WAP in java to count th efrequency of each letter in the string.

import java.util.Scanner;

public class StringQ3 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the statement: ");
		//will read statement and store it in "S" for further process.
		str = sc.nextLine();
		int count = 0, len = 0;
		do {
			try {
				//this loop will identify character and find how many times it occurs.
			    char name[] = str.toCharArray();
			    len = name.length;
			    count = 0;
			    for(int j=0;j<len;j++) {
					if((name[0]==name[j]) && ((name[0]>=65 && name[0]<=91)||(name[0]>=97 && name[0]<=123)))
				    count++;
			    }
			    if(count != 0) {
			    	//prints all repeated characters.
			    	System.out.println(name[0]+" "+count+" Times");
			    }
			    str = str.replace(""+name[0],"");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		while(len!=1);
		
		sc.close();
	}

}
