package junit5_Question2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Should Return Min & Max value")
class MinMaxClassTest {
	@Test
	@DisplayName("Should Return Min value")
	void testMin() {
		
		MinMaxClass min = new MinMaxClass();
	    int[] array = {2, 11, 5, 16, 1, 180, 3, 6};
	    assertEquals(1, min.findMin(array));

	}

	@Test
	@DisplayName("Should Return Max value")
	void testMax() {
		
		MinMaxClass max = new MinMaxClass();
	    int[] array = {11, 2, 4, 3, 10000, 2, 5, 16};
	    assertEquals(10000, max.findMax(array));

	}
}



 
