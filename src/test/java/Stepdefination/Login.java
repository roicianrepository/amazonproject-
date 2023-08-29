package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.junit.Assert;


public class Login {
	
     WebDriver driver;
     
	@Given("user must be on amazon sign in page by clicking on url {string}")
	public void user_must_be_on_amazon_sign_in_page_by_clicking_on_url(String string) {
	    System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	    driver= new FirefoxDriver();
	    driver.get(string);
	    
	}

	@When("^Enter Valid (.*)$")
	public void enter_valid_e_mail_address(String Email) throws InterruptedException {
	    driver.findElement(By.id("ap_email")).sendKeys(Email);
	    Thread.sleep(4000);
	}

	@When("click on continue button")
	public void click_on_continue_button() {
	    driver.findElement(By.id("continue")).click();
	}

	@When("^Enter valid (.*)$")
	public void enter_valid_password(String password)  {
	    driver.findElement(By.id("ap_password")).sendKeys(password);
	   
	}
	 
	    @When("click on signin button")
	    public void click_on_signin_button() {
	       driver.findElement(By.id("signInSubmit")).click();
	}

	@Then("User must be navigated to his or her account")
	public void user_must_be_navigated_to_his_or_her_account() 
	{
    String actualresult=driver.getCurrentUrl();
    Assert.assertEquals("https://www.amazon.ca/?ref_=nav_custrec_signin", actualresult);
    
    
    driver.close();
	}}

