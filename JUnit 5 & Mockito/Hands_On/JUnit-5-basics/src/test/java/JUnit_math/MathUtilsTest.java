package JUnit_math;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	//Creating member variable
	MathUtils mathUtils;
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This needs to run before all");
	}
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("cleaning up...");
	}

	@Test
	@DisplayName("Testing add method")
	void testAdd() {
		//MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual,"This method should Add");
	}
	
	@Test
	void testDivide() {
		boolean serverUp = false;
		assumeTrue(serverUp);
		//MathUtils mathUtils = new MathUtils();
		
		//assertThrows(NullPointerException.class, () -> mathUtils.divide(1,0),"Divide");
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0),"Dividey zero throws an exception");
	}
	
	@Test
	@EnabledOnOs(OS.LINUX)
	void testComputeCircleArea() {
		//MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793,mathUtils.computeCircleArea(10), "Should return right Area");
	}
	@Test
	@DisplayName("Test Driven Method, should not run")
	@Disabled
	void testDisabled() {
		fail("This test is disabled");
	}


}
