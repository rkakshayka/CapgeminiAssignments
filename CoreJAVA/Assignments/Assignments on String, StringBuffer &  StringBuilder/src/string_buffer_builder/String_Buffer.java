package string_buffer_builder;

public class String_Buffer {
	public static void main(String[] args) {
		//Question 1
		System.out.println("Question 1------------------------------------------");
		StringBuffer buffer1 = new StringBuffer("StringBuffer");
		StringBuffer buffer2 = new StringBuffer("is a peer class of String");
		StringBuffer buffer3 = new StringBuffer("that provides much of");
		StringBuffer buffer4 = new StringBuffer("the functionality of strings");
		buffer1.append(buffer2).append(buffer3).append(buffer4);
		System.out.println("Append String is : "+buffer1);
		
		//Question 2
		System.out.println("Question 2------------------------------------------");
		StringBuffer bufInsert = new StringBuffer("It is used to _ at the specified index position");
		System.out.println("Before inserting : "+bufInsert);
		bufInsert.insert(15,"insert text");
		System.out.println("After inserting : "+bufInsert);
		
		//Question 3
		System.out.println("Question 3------------------------------------------");
		StringBuffer buffer = new StringBuffer("This method returns the reversed object on which it was called");
	    System.out.println("Before Reversing : "+buffer);
	    buffer.reverse();
	    System.out.println("After Reversing : "+buffer);
	}

}
