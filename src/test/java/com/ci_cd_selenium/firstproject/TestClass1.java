package com.ci_cd_selenium.firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
public class TestClass1 {
	 WebDriver driver;

    @BeforeMethod
	public void launchDriver() throws InterruptedException, MalformedURLException{
    	ChromeOptions options = new ChromeOptions();
    	options.setPlatformName("Windows 11");
    	
    	
	     //driver = new ChromeDriver();
         driver = new RemoteWebDriver(new URL("http://192.168.43.207:4444/wd/hub"), options);
	     System.out.println("Browser is launched");
	
	     
		 driver.manage().window().maximize();	
		
	}
	@Test
	public void test1(){
		driver.navigate().to("https://www.google.com");
		System.out.println("test 1 title is "+ driver.getTitle());
		}
	@Test
	public void test2(){
		driver.navigate().to("https://www.yahoo.com");
		System.out.println("test 2 title is... "+ driver.getTitle());
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
