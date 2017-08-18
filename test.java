package TestNG;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	WebDriver driver;

	@BeforeTest
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("file:///C:/Users/VIVEK/Desktop/New%20folder/New%20folder/index.html");
		driver.manage().window().maximize();
		
	}

	@AfterTest
	public void closebrowser() {
		driver.close();

	}

	@Test( )
	public void application() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.id("alpaca3")).sendKeys("vivek");
		driver.findElement(By.xpath("//input[@id='alpaca4']")).sendKeys("23");
		driver.findElement(By.xpath(".//*[@id='alpaca2']/div[1]/div/div[3]/div/div[2]/label")).click();
		
		Thread.sleep(5000);
	      Select s = new Select(driver.findElement(By.id("alpaca10")));
         	s.selectByVisibleText("California");
	      	
         	Select s1 = new Select(driver.findElement(By.id("alpaca12")));
         	s1.selectByVisibleText("India");
         	Thread.sleep(5000);
         	driver.findElement(By.xpath(".//*[@id='alpaca2']/div[2]/button[1]")).click();
         	
		
		
		
	}

}
