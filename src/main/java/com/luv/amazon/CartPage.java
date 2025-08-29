package com.luv.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@value='Proceed to checkout']")
	WebElement proceed_to_buy;
	
	public void ProceetoBuy() {
		wait.until(ExpectedConditions.elementToBeClickable(proceed_to_buy));
		proceed_to_buy.click();
	}

}
