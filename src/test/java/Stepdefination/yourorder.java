package Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class yourorder {
	
	WebDriver driver;
	Actions action;
	
	@Given("User must be on sign in page of google by url {string}")
	public void user_must_be_on_sign_in_page_of_google_by_url(String string) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	    driver= new FirefoxDriver();
	    driver.get(string);
	}

	@Given("user should enter username and click on continue")
	public void user_should_enter_username_and_click_on_continue() {
		driver.findElement(By.id("ap_email")).sendKeys("poojasethi131096@gmail.com");
		driver.findElement(By.id("continue")).click();
	}

	@Given("User should enter password and click on sign in button")
	public void user_should_enter_password_and_click_on_sign_in_button() {
		driver.findElement(By.id("ap_password")).sendKeys("Ishwinder@123");
		driver.findElement(By.id("signInSubmit")).click();
	}

	@When("After login, user must be mousehover on Hello option")
	public void after_login_user_must_be_mousehover_on_hello_option() throws InterruptedException {
		action= new Actions(driver); 
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		Thread.sleep(4000);
	}

	@When("user must be move the mouse on your order button and click on it")
	public void user_must_be_move_the_mouse_on_your_order_button_and_click_on_it() throws InterruptedException {
		 driver.findElement(By.cssSelector("#nav_prefetch_yourorders > span")).click();
		   Thread.sleep(3000);
	}

	@Then("it must navigate to your order page")
	public void it_must_navigate_to_your_order_page() {
	    String actualresult=driver.getCurrentUrl();
	    Assert.assertEquals("https://www.amazon.ca/your-orders/orders/ref=yo_oh_gp_to_ov?_encoding=UTF8&ref_=nav_AccountFlyout_orders", actualresult);
	    
	}

	
	  @Given("User should be on sign in page of google by url {string}") public
	  void user_should_be_on_sign_in_page_of_google_by_url(String string) 
	  { 
		  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		    driver= new FirefoxDriver();
		    driver.get(string);
	  }
	  @Given("user should be  entered username and click on continue") public void
	  user_should_be_entered_username_and_click_on_continue() { 
		  driver.findElement(By.id("ap_email")).sendKeys("poojasethi131096@gmail.com");
	      driver.findElement(By.id("continue")).click();
	  }
	  
	  @Given("User should be  entered password and click on sign in button") public
	  void user_should_be_entered_password_and_click_on_sign_in_button() {
		  driver.findElement(By.id("ap_password")).sendKeys("Ishwinder@123");
			driver.findElement(By.id("signInSubmit")).click(); 
			}
	  
	  @When("After login, user must be mousehover on Hello option on top right corner"
	  ) public void after_login_user_must_be_mousehover_on_hello_option_on_top_right_corner() throws InterruptedException {
		  action= new Actions(driver); 
		  action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		   Thread.sleep(3000); }
	  
	  @When("user must be move the mouse on yourorder button and click on it")
	  public void user_must_be_move_the_mouse_on_yourorder_button_and_click_on_it() throws InterruptedException
	  { 
		  driver.findElement(By.linkText("Your Orders")).click();
		  Thread.sleep(3000);
		 
	    }
	  
	
	  @When("user is able to view the order like previous three  months order, this year or any archieved orders"
	  ) public void
	  user_is_able_to_view_the_order_like_previous_three_months_order_this_year_or_any_archieved_orders
	  () throws InterruptedException { 
		  driver.findElement(By.id("a-autoid-1-announce")).click();
		  Thread.sleep(2000);
		  Select obj= new Select(driver.findElement(By.cssSelector(".a-dropdown-prompt"))); 
		 
		  }
	  
	  @Then("it must navigate to your order page and user should be able to view the orders liek in past three months, this year or any archieved order"
	  ) public void
	  it_must_navigate_to_your_order_page_and_user_should_be_able_to_view_the_orders_liek_in_past_three_months_this_year_or_any_archieved_order
	  () throws InterruptedException { 
		  driver.findElement(By.id("a-autoid-1-announce")).click();
		  Thread.sleep(2000);
		  Select obj= new Select(driver.findElement(By.cssSelector(".a-dropdown-prompt"))); 
		
		  }  
		  
	  }
	 
	 




