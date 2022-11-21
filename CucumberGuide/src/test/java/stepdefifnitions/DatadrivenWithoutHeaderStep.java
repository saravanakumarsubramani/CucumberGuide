package stepdefifnitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DatadrivenWithoutHeaderStep {
	WebDriver driver;
	@Given("You are on the login page")
	public void you_are_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe" );
	     driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("You enter the valid credentials")
	public void you_enter_the_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<String> credentials=dataTable.asList(String.class);
		 String username=credentials.get(0); 
		 String password=credentials.get(1);

		 driver.findElement(By.id("txtUsername")).sendKeys(username);
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
		 
	}
	@When("You clicks the login button")
	public void you_clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("btnLogin")).click();
	}
	@Then("You should see the home page screen")
	public void you_should_see_the_home_page_screen() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status=
				  driver.findElement(By.linkText("Welcome kotadj")).isDisplayed(); 
		if(status) {
				  System.out.println("result displayed"); 
				  } 
	}
}
