package JUnit_math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NestedExample {
	
	@Nested
	@DisplayName("Testing Add method ")
	@Tag("MathAdd")
	class AddTest {
		@Test
		@DisplayName("Adding 2 positive Numbers")
		@Tag("AddPositive")
		void testAddPositive() {
			MathUtils testobj = new MathUtils(); 
			assertEquals(2,testobj.add(1,1));
		}
		
		@Test
		@DisplayName("Adding 2 Negative Numbers")
		@Tag("AddNegative")
		void testAddNegative() {
			MathUtils testobj = new MathUtils(); 
			assertEquals(-2,testobj.add(-1,-1));
		}	
	}
	
	@Test
	@DisplayName("Multiplying 2 positive Numbers")
	@Tag("MathMultiple")
	void testMultiply() {
		MathUtils testobj = new MathUtils(); 
		assertEquals(12,testobj.multiply(12,1));
	}

}
