package stepdefifnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenorangeHrm {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe" );
	     driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}
	@When("the user enters the valid username and password")
	public void the_user_enters_the_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	
	  @When("clicks on the login button") public void clicks_on_the_login_button()
	  { // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.id("btnLogin")).click(); 
	 }
	  
	  @Then("the user go to the home page") public void
	  the_user_go_to_the_home_page() 
	  { // Write code here that turns the phrase
	 
	  boolean status=
	  driver.findElement(By.linkText("Welcome kotadj")).isDisplayed(); if(status) {
	  System.out.println("result displayed"); 
	  } 
	  }
	 

}
