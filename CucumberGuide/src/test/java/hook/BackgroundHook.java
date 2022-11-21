package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BackgroundHook {

	@Before
	public void beforescenario() {
		System.out.println("this will run before all scenario");
	}
	
  @After	
  public void afterscenario() {
		System.out.println("this will run after all scenario");
	}
  @Before(order=0)
	public void beforefirstscenario() {
		System.out.println("this will run before first scenario");
	}
  @Before(order=1)
	public void beforesecondscenario() {
		System.out.println("this will run before second scenario");
	}
	
@After(order=1)
public void afterfirstscenario() {
		System.out.println("this will run after first scenario");
	}
@After(order=0)
public void aftersecondscenario() {
		System.out.println("this will run after second scenario");
	}
}
