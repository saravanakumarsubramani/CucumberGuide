package stepdefifnitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataDrivenWithHeader {
	WebDriver driver;
	@Given("Go the login page")
	public void go_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe" );
	     driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("enter the valid credentials")
	public void enter_the_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<Map<String, String>> logindetails = dataTable.asMaps(String.class, String.class);
		String User = logindetails.get(0).get("username");
		String passwd = logindetails.get(0).get("password");
		
		 driver.findElement(By.id("txtUsername")).sendKeys(User);
		 driver.findElement(By.id("txtPassword")).sendKeys(passwd);
	}
	@When("click login button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("btnLogin")).click();
		
	}
}
