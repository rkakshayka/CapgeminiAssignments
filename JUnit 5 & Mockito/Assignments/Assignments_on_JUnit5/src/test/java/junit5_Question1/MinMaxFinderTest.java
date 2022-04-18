package junit5_Question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Running Test case")
class MinMaxFinderTest {

	@Test
	void testMinMaxFind() {
		MinMaxFinder m = new MinMaxFinder();
		int expected[] = new int[] {0,69};
		assertArrayEquals(expected, m.arr(new int[] {56,34,7,0,54,3,34,34,69} ));
	}

	@Test
	void testMinMaxFind1() {
		MinMaxFinder m1 = new MinMaxFinder();
		int expected1[] = new int[] {1,991};
		assertArrayEquals(expected1, m1.arr(new int[] {30,1,10,25,56,991,87,45,10} ));
	}
	
	@Test
	void testMinMaxFind2() {
		MinMaxFinder m2 = new MinMaxFinder();
		int expected2[] = new int[] {101,999};
		assertArrayEquals(expected2, m2.arr(new int[] {999,101,205,665,777,854,465} ));
	}
	
}