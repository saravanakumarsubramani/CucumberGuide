package stepdefifnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginwithdatastep {
	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe" );
	     driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("the user enters the valid credentials {string} and {string}")
	public void the_user_enters_the_valid_credentials_and(String string, String string2) {
		 driver.findElement(By.id("txtUsername")).sendKeys(string);
		   driver.findElement(By.id("txtPassword")).sendKeys(string2);
	}
	@When("clicks  the login button")
	public void clicks_the_login_button() {
		 driver.findElement(By.id("btnLogin")).click();
	}
	@Then("the user go to the home page screen")
	public void the_user_go_to_the_home_page_screen() {
		boolean status=
				  driver.findElement(By.linkText("Welcome kotadj")).isDisplayed(); 
		if(status) {
				  System.out.println("result displayed"); 
				  } 
	}

}
