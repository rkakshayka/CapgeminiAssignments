package annotation_assignments;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
Create a custom annotation called @Test which can be only applied on a method implying 
that the following method is a test-case. (Is it possible to restrict the annotation to be 
applied only on a non-static method?)
**/

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface Test{
	int test_case() default 1;
}

@Test(test_case = 6)

class TestCase{
	public void runTestCase(){
        System.out.println("Test Case passed successfully");
    }
}

public class AnnotationQ1 {
	public static void main(String[] args) {
		TestCase test = new TestCase();
		test.runTestCase();		
	}
}
