package com.luv.amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {
	
	WebDriver driver;
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement first_product;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement click_add_to_cart;
	
	@FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
	WebElement price;
	
	public void clickProduct() {
		wait.until(ExpectedConditions.elementToBeClickable(first_product));
		first_product.click();
	}
	
	public void addToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(click_add_to_cart));
		click_add_to_cart.click();
	}
	
	public void isDisplayedPrice() {
		String text = price.getText();
		System.out.println(text);
		}
		
	}


