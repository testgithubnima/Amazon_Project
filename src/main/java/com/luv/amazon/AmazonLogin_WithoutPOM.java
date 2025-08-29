package com.luv.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLogin_WithoutPOM {
	@Test
	public void loginAmazon() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		login.click();
	}
	
	

}
