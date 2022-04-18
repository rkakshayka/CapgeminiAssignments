package JUnit_math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class Testcase2 {

	@Test
	void testAddPositive() {
		MathUtils testobj = new MathUtils(); 
		assertEquals(2,testobj.add(1,1));
	}
	
	@Test
	void testAddNegative() {
		MathUtils testobj = new MathUtils(); 
		assertEquals(-2,testobj.add(-1,-1));
	}
	
	@Test
	@DisplayName("mulitply method")
	void testMultiply() {
		MathUtils testobj = new MathUtils();
		assertAll(
				() -> assertEquals(1,testobj.multiply(-1,-1)),
				() -> assertEquals(0,testobj.multiply(-1,0)),
				() -> assertEquals(4,testobj.multiply(2,2))
				);
	}
	
	//Using suppliers for assert messages
	@Test
	@DisplayName("Testing of add method")
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = -2;
		int actual = mathUtils.add(-1, -1);
		assertEquals(expected, actual,() -> "should return sum "+expected+"but returned "+actual);
	}

	@RepeatedTest(3)
	void testComputeCircleArea(RepetitionInfo reptinfo) {
		reptinfo.getTotalRepetitions();
	
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793,mathUtils.computeCircleArea(10), "Should return right Area");
	}

}

