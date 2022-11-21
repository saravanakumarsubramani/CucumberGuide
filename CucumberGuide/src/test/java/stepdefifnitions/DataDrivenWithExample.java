package stepdefifnitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataDrivenWithExample {
	WebDriver driver;
	@Given("proceed to login page")
	public void proceed_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe" );
	     driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("enter the valid credentials {string} and {string}")
	public void enter_the_valid_credentials_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.findElement(By.id("txtUsername")).sendKeys(username);
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	@When("Clicked login button")
	public void clicked_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("btnLogin")).click();	  
	}
}
