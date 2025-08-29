package com.luv.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass_Amazon {

	public static WebDriver driver;

	@BeforeMethod
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void Quit() {
		driver.quit();

	}

}
