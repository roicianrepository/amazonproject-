package amazonsignup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Signuppage {

	public static void main(String[] args) {
		
		//to open the browser 
	WebDriver driver; 	
	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	
	driver=new FirefoxDriver();
    driver.get("https://www.amazon.ca/");
    
	 Actions action =new Actions (driver);
	 
    action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
    driver.findElement(By.linkText("Start here.")).click();
   
    
    driver.findElement(By.id("ap_customer_name")).sendKeys("pooja");
    driver.findElement(By.id("ap_email")).sendKeys("ishwindersingh06@yahoo.co.in");
    driver.findElement(By.id("ap_password")).sendKeys("neerusaini");
    driver.findElement(By.id("ap_password_check")).sendKeys("neerusaini");
    driver.findElement(By.id("continue")).click();
   driver.get("https://www.amazon.ca/ap/cvf/request?arb=d31beef8-fe0e-4524-9f63-5076f014eaf7");
   driver.findElement(By.cssSelector("#cvf-input-code")).sendKeys("339978");
   driver.findElement(By.cssSelector("#cvf-submit-otp-button > span > input")).click();
   
   driver.findElement(By.cssSelector("#cvf-page-content > div > div > div > form > div:nth-child(6) > div > div.a-fixed-left-grid.a-spacing-top-mini > div > div.a-fixed-left-grid-col.a-col-right > input")).sendKeys("6479814100");
   driver.findElement(By.cssSelector("#a-autoid-0 > span > input")).click();
	}

}
