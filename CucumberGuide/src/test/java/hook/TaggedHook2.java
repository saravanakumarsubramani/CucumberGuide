package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHook2 {
	
	/*
	 * @Before public void beforescenario() {
	 * System.out.println("this will run before every scenario"); }
	 * 
	 * @After public void afterscenario() {
	 * System.out.println("this will run after every scenario"); }
	 */
	/*
	 * @Before("@first") public void beforefirst() {
	 * System.out.println("this will run before first scenario"); }
	 * 
	 * @Before("@first,@second") public void beforefirstandsecond() {
	 * System.out.println("this will run before first and second scenario"); }
	 */

	/*
	 * @Before("@second") public void beforesecond() {
	 * System.out.println("this will run before second scenario"); }
	 */
	/*@Before("@third")
	public void beforethird() {
		System.out.println("this will run before third scenario");
	}
	@After("@first")
	public void afterfirst() {
		System.out.println("this will run after first scenario");
	}
	@After("@second")
	public void aftersecond() {
		System.out.println("this will run after second scenario");
	}
	@After("@second,@third")
	public void aftersecondandthird() {
		System.out.println("this will run after second and third scenario");
	}
	/*
	 * @After("@third") public void afterthird() {
	 * System.out.println("this will run after third scenario"); }
	 */
}
