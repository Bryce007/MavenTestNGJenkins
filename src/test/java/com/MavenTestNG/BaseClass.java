package com.MavenTestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseClass {
@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		String url="https://www.google.com/";
        driver.get(url);
        String title  =driver.getTitle();

        AssertJUnit.assertEquals("Google", title);

        driver.quit();
	}
@Test
public void failThis() {
	Assert.assertEquals(12, 12);
}
}
