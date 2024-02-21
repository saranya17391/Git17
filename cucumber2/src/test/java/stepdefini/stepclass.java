package stepdefini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepclass {
	WebDriver driver;
	@Given("user launch firefox browser")
	public void user_launch_firefox_browser() {
		driver=new FirefoxDriver();
	   
	}

	@And("user enter url")
	public void user_enter_url() {
	   driver.get("https://www.facebook.com/");
	}

	@Then("user enters username and password")
	public void user_enters_username_and_password() {
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("huyfgu");
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12234");
	}

	@And("click login")
	public void click_login() {
		driver.findElement(By.name("login")).click();
	}
	@Then("user enters {string} and {string}")
	public void user_enters_saranya_and(String un, String pss) {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(un);
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pss);
	}
	}
	



	

