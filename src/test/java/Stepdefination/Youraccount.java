package Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Youraccount {
	WebDriver driver;
	

	@Given("User must be on sign in page of amazon by selecting url {string}")
	public void user_must_be_on_sign_in_page_of_amazon_by_selecting_url(String string) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	    driver= new FirefoxDriver();
	    driver.get(string);
	    
	}

	@Given("user must enter username and click on continue")
	public void user_must_enter_username_and_click_on_continue() {
		driver.findElement(By.id("ap_email")).sendKeys("poojasethi131096@gmail.com");
		driver.findElement(By.id("continue")).click();
	}

	@Given("User must enter password and click on sign in button")
	public void user_must_enter_password_and_click_on_sign_in_button() {
	driver.findElement(By.id("ap_password")).sendKeys("Ishwinder@123");
	driver.findElement(By.id("signInSubmit")).click();
	}

	@When("After login, user must be mousehover on username heading")
	public void after_login_user_must_be_mousehover_on_username_heading() throws InterruptedException {
	 Actions action= new Actions(driver); 
	action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
	Thread.sleep(4000);
	}

	@When("user must be move the mouse on your account button and click on it")
	public void user_must_be_move_the_mouse_on_your_account_button_and_click_on_it() throws InterruptedException {
	    driver.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();
	   Thread.sleep(3000);
	}

	@Then("Your account page must be displayed")
	public void your_account_page_must_be_displayed() {
	   
		 String actualresult=driver.getCurrentUrl();
		    Assert.assertEquals("https://www.amazon.ca/gp/css/homepage.html?ref_=nav_AccountFlyout_ya", actualresult);
	}

}
