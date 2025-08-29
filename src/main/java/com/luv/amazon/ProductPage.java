package com.luv.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(id="add-to-cart-button")
	WebElement add_cart;
	
	
	public void addCart() {
		wait.until(ExpectedConditions.elementToBeClickable(add_cart));
		add_cart.click();
	}

}
