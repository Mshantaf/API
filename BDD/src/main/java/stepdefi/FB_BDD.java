package stepdefi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.ByteString;

public class FB_BDD {
	public WebDriver driver;
	
	 @Before ()
	 
	  public void beforeMethod() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moe\\eclipse-workspace\\first\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
	 }
	 
	 @After ()
	  public void afterMethod() {
		  driver.close();
	  }
	
//	@Given("I navigate to facebook website")
//	public void i_navigate_to_facebook_website() throws InterruptedException {
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moe\\eclipse-workspace\\first\\drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
//	}

	@When("I enter username {string}")
	public void i_enter_username(String email) throws InterruptedException {
		WebElement fb_EmailField=driver.findElement(By.xpath("//*[@name=\"email\"]"));
		fb_EmailField.sendKeys(email);
		Thread.sleep(3000);
	}

	@When("I enter password {string}")
	public void i_enter_password(String pass) throws InterruptedException {
	    WebElement fb_PassField=driver.findElement(By.xpath("//*[@id='pass']"));
	    fb_PassField.sendKeys(pass);
	    Thread.sleep(3000);
	}

	@Then("I an able to login")
	public void i_an_able_to_login() throws InterruptedException {
		WebElement login=driver.findElement(By.xpath("//*//*[@name='login']")) ;  ////*[@type="submit"]
		login.click();
		Thread.sleep(10000);
		
	}


}
