package com.luv.amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage_Search {

	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

	public HomePage_Search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="twotabsearchtextbox")
	WebElement search_product;

	@FindBy(xpath = "//div[@class='s-suggestion-container']")
	List<WebElement> list_products;

	public void searchProduct() {
		wait.until(ExpectedConditions.visibilityOf(search_product));
		
		search_product.sendKeys("shoe");
//		search_product.sendKeys(Keys.ENTER);
//		Select s=new Select(search_product);
//		s.selectByVisibleText("shoes for woman");;
		
		
		//dropdowns
		search_product.sendKeys(Keys.ARROW_DOWN);
		search_product.sendKeys(Keys.ARROW_DOWN);
		search_product.sendKeys(Keys.ENTER);
	}
	
	public void productAutosuggestions() {
		int size = list_products.size();

		for (WebElement product : list_products) {
			String text = product.getText();
			System.out.println(text);
		}
	}

}
