package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {
	@Before
	public void setUp(Scenario scenario) {
		System.out.println("**Execution has started"  +scenario.getName());
		System.out.println("++Browser got launched and maximized++");
		System.out.println("++Application URL got opened in the browser++");
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("**Execution has ended"  +scenario.getName());
		System.out.println("--Logged out from the application--");
		System.out.println("--Browser got closed--");
	}
	

}
