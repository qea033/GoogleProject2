package com.googleTest.GoogleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestImageClass {

	public WebDriver driver;
	
	@Test
  public void testImage() {
	TestClass t = new TestClass();
	driver = t.browserSeteup();
	
	driver.findElement(By.linkText("Images")).isDisplayed();
	
	}
}
