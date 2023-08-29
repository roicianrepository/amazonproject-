package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Keepmesignin {
	
	WebDriver driver;
	
	@Given("user should be on amazon sign in page and url is {string}")
	public void user_should_be_on_amazon_sign_in_page_and_url_is(String string) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	    driver= new FirefoxDriver();
	    driver.get(string);
	    
	}

	@When("User must be able to enter valid email id")
	public void user_must_be_able_to_enter_valid_email_id() {
	    driver.findElement(By.id("ap_email")).sendKeys("poojasethi131096@gmail.com");
	}

	@When("user must click on continue button")
	public void user_must_click_on_continue_button() {
	    driver.findElement(By.id("continue")).click();
	}

	@When("user click on keep me sign in checkbox")
	public void user_click_on_keep_me_sign_in_checkbox() {
	    driver.findElement(By.cssSelector("#authportal-main-section > div:nth-child(2) > div > div:nth-child(2) > div > form > div > div:nth-child(7) > div > div > label > div > label > input[type=checkbox]")).click();
	}

	@Then("Keep me sign in checkbox must get selected")
	public void keep_me_sign_in_checkbox_must_get_selected() {
	  boolean a= driver.findElement(By.cssSelector("#authportal-main-section > div:nth-child(2) > div > div:nth-child(2) > div > form > div > div:nth-child(7) > div > div > label > div > label > input[type=checkbox]")).isSelected();
	System.out.println(a);
	}

}
