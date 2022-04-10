package string_buffer_builder;

public class String_Builder {
	public static void main(String[] args) {
		//Question 1
		System.out.println("Question 1------------------------------------------");
		StringBuilder builder1 = new StringBuilder("StringBuilder");
		StringBuilder builder2 = new StringBuilder("is a peer class of String");
		StringBuilder builder3 = new StringBuilder("that provides much of");
		StringBuilder builder4 = new StringBuilder("the functionality of strings");
		builder1.append(builder2).append(builder3).append(builder4);
		System.out.println("Append String is : "+builder1);
		
		//Question 2
		System.out.println("Question 2------------------------------------------");
		StringBuilder builderInsert = new StringBuilder("It is used to _ at the specified index position");
		System.out.println("Before inserting : "+builderInsert);
		builderInsert.insert(15,"insert text");
		System.out.println("After inserting : "+builderInsert);
		
		//Question 3
		System.out.println("Question 3------------------------------------------");
		StringBuilder builder = new StringBuilder("This method returns the reversed object on which it was called");
	    System.out.println("Before Reversing : "+builder);
	    builder.reverse();
	    System.out.println("After Reversing : "+builder);
	}


}
