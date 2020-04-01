package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public   WebDriver driver;
	
	
  @Test
  public void f() {
	  
	   driver.findElement(By.xpath("//input[@type='email'][@name='email']")).sendKeys("Nancy@gmail.com");
	   driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).sendKeys("jennifer");
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	   System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	   
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://www.facebook.com/");
		 driver.manage().window().maximize();
	 }

  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
