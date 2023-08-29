package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	
	WebDriver driver; 

	@Given("user must be on homepage by clicking on url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String string) {
	    System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	    driver= new FirefoxDriver();
	    driver.get(string);
	}



	@When("user clicks on Signin button")
	public void user_clicks_on_signin_button() throws InterruptedException {
	 driver.findElement(By.linkText("Sign in")).click();
	 Thread.sleep(4000);
	}

	
	
	  @Then("Signin Page should be displayed") public void
	  signin_page_should_be_displayed() { 
		  
		String b= driver.getCurrentUrl();
				  System.out.println(b);
		  
	  }
	 
	  
	 
	

	

}
