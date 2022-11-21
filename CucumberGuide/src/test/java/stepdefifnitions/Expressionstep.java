package stepdefifnitions;

import io.cucumber.java.en.Given;

public class Expressionstep {
	
	
	  @Given("I have (\\d+) laptop$") 
	  public void I_have_1_laptop(int count) {
	  System.out.println("laptop count"+count); }
	 
	@Given("^I have a (\\d+\\.\\d+) CGPA$")
	public void i_have_a_cgpa(float num) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("CGPA IS"+num);
}
	@Given("{string} is elder to {string} and {string}")
	public void is_elder_to_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(string +" is elder to "+ string2 + "and "+ string3);
	}
}