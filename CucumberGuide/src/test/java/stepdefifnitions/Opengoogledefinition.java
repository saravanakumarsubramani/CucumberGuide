package stepdefifnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Opengoogledefinition {
	 WebDriver driver;
	
	@Given("user is the entering google.com")
	public void user_is_the_entering_google_com() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe" );
	     driver=new ChromeDriver();
	    driver.get("http://www.google.co.in");
	}
	@When("the user clicks the search term {string}")
	public void the_user_clicks_the_search_term(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(string);
	}
	@When("enters the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
	}
	@Then("the user should see the  results for saravanakumar")
	public void the_user_should_see_the_results_for_saravanakumar() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    boolean status=driver.findElement(By.partialLinkText("saravana")).isDisplayed();
		  if(status) {
			  System.out.println("result displayed");
		  }}
	}

