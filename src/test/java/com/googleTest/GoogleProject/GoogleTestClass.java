package com.googleTest.GoogleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTestClass {
  
	public static WebDriver driver;
	
  @Test
  public void verifyTitle() {
	  String expectedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  
	  Assert.assertEquals(expectedTitle, actualTitle);
	  
  }
  
  @Test
  public void verifyImagesLink() {
	  WebElement images = driver.findElement(By.linkText("Images"));
	  images.isDisplayed();
  }
  
  @BeforeTest
  public void driverSetup() {
	  System.setProperty("webdriver.chrome.driver", "./Browser Driver Files//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.google.com");
  }
  
  @AfterTest
  public void tearDown() {
	  driver.close();
  }
  
}
