package JUnit_math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

@DisplayName("When running TestInfoReporter")
public class TestInfoReporter {
	//Creating member variable for all of the test methods
	MathUtils mathUtils;
	TestInfo testinfo;
	TestReporter testreporter;
    
    @BeforeEach
	void init(TestInfo testinfo, TestReporter testreporter) {
    	this.testinfo=testinfo;
    	this.testreporter=testreporter;
		mathUtils = new MathUtils();
	}		
    
    @Test
	@DisplayName("Multiplying 2 positive Numbers")
	@Tag("MathMultiple")
	void testMultiply() {
    	System.out.println("Running..."+testinfo.getDisplayName()+"with tags"+testinfo.getTags());
    	//streporter.publishEntry("Running..."+testinfo.getDisplayName()+"with tags"+testinfo.getTags(),"" );
    	assertEquals(12,mathUtils.multiply(12,1));
	}
}			
