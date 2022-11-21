package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Taghook {
	
	@Given("This is the {int} first step")
	public void this_is_the_first_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("this is first step");
	}
	@When("This is the  {int} Second step")
	public void this_is_the_second_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is second step");
	}
	@Then("This is the {int} Third step")
	public void this_is_the_third_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is third step");
	}

}
