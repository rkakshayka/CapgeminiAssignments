package junit5_Question4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Testing of LifecycleHooks")
class LifeCycleHooksTest {

    LifeCycleHooks calAdd;
    LifeCycleHooks calMultiple;

    @BeforeAll
    static void SetupAll() {
        System.out.println("Executes once before all test methods in this class ");
    }

    @BeforeEach
    void setup() {
    	calAdd = new LifeCycleHooks();
    	calMultiple = new LifeCycleHooks();
        System.out.println("Executes before each test methods in this class");
    }

    @Test
    @DisplayName("Should give right Addition")
    void testAdd() {
        assertAll(
				() -> assertEquals(5, calAdd.add(2,3)),
				() -> assertEquals(1, calAdd.add(-2,3)),
				() -> assertEquals(-5, calAdd.add(-2,-3))
				);
    }
    
    @Disabled
    @DisplayName("Should give right multiplication")
    @Test
    void testMultiply() {
        assertAll(
				() -> assertEquals(36, calMultiple.multiply(6, 6)),
				() -> assertEquals(6, calMultiple.multiply(-6, -1)),
				() -> assertEquals(0, calMultiple.multiply(6, 0))
				);
    }

    @AfterEach
    void setup2() {
        System.out.println("Executes after each test method in this class");
    }

    @AfterAll
    static void SetupAll2() {
        System.out.println("Executes once after all test methods in this class");
    }
}
