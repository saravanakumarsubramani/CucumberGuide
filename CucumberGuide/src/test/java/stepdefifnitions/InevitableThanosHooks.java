package stepdefifnitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InevitableThanosHooks {
	
	@Given("THANOS HAS THE INFIFNITY stones")
	public void thanos_has_the_infifnity_stones() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("THANOS HAS THE INFIFNITY stones");
	}
	@When("the thanos snaps his fingers")
	public void the_thanos_snaps_his_fingers() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("the thanos snaps his fingers");
	}
	@Then("half of the living thing died")
	public void half_of_the_living_thing_died() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("half of the living thing died");
	}
}
