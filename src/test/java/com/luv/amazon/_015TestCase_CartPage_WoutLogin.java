package com.luv.amazon;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)
public class _015TestCase_CartPage_WoutLogin extends BaseClass_Amazon {

	@Test(retryAnalyzer = RetryAnalyzerLogic.class)
	public void addCart() throws InterruptedException {

		HomePage_Search search = new HomePage_Search(driver);
		search.searchProduct();

		SearchResultPage result = new SearchResultPage(driver);
		result.clickProduct();
        Thread.sleep(2000);
		result.addToCart();

		
		CartPage cart = new CartPage(driver);
		WebElement proceed_to_buy = cart.proceed_to_buy;
		Assert.assertEquals(proceed_to_buy.isDisplayed(), true);

	}

}
