package imp.stepDefinition;

import imp.util.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	@Before
	public static void setup() {
		HelperClass.setUpDriver();
	}
	
	@After
	public static void tearDown() {
        HelperClass.tearDown();
	}
}
