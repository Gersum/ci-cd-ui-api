package com.ci_cd_selenium.firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	 WebDriver driver;

    @BeforeMethod
	public void launchDriver() throws InterruptedException{
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
	    
//	     System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (1)\\geckodriver.exe");
	    driver = new ChromeDriver();
	     //driver = new FirefoxDriver();
	    
	     System.out.println("Browser is launched");
	     Thread.sleep(2000);
		 driver.manage().window().maximize();	
		 Thread.sleep(2000);
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	public void test1(){
		driver.navigate().to("https://www.google.com");
		System.out.println("test 1 title is "+ driver.getTitle());
		}
	@Test
	public void test2(){
		driver.navigate().to("https://www.yahoo.com");
		System.out.println("test 2 title is "+ driver.getTitle());
	}
	
	@Test
	public void test3(){
		driver.navigate().to("https://www.poe.com");
		System.out.println("test 3 title is "+ driver.getTitle());
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
