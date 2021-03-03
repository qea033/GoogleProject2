package com.googleTest.GoogleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	 public WebDriver driver;
		
	 
	
	 
	 
	   @Test
	   public void testTitle() {
		   String eTitle="Google";
		   String aTitle = driver.getTitle();
		   Assert.assertEquals(eTitle, aTitle);
	   }
	   
		@BeforeTest
	  public WebDriver browserSeteup() {
		  System.setProperty("webdriver.chrome.driver", "./Browser Driver Files//chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  driver.get("http://www.google.com");
		  return driver;
	  }

		
		@AfterTest
		public void tearDown() {
			driver.close();
		}
}
