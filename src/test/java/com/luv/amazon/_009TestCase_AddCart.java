package com.luv.amazon;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(ListenerLogic.class)
public class _009TestCase_AddCart extends BaseClass_Amazon {

	@Test(retryAnalyzer = RetryAnalyzerLogic.class)
	public void addCart() throws InterruptedException {

		Loginpage login = new Loginpage(driver);
		login.login();
		login.emailOrPhoneNum();
		login.clickContinue();
		Thread.sleep(2000);
		login.password();
		login.clickSignIn();

		Thread.sleep(3000);

		HomePage_Search search = new HomePage_Search(driver);
		search.searchProduct();

		SearchResultPage result = new SearchResultPage(driver);
		result.clickProduct();
        Thread.sleep(2000);
		result.addToCart();

		
		CartPage cart = new CartPage(driver);
		WebElement proceed_to_buy = cart.proceed_to_buy;
		
		String title = driver.getTitle();
		
		Assert.assertTrue(title.contains("Shopping Cart"));
		
		/*
		 * SoftAssert ass=new SoftAssert();
		 * ass.assertTrue(proceed_to_buy.isDisplayed());
		 */
		
		
//		Assert.assertEquals(proceed_to_buy.isDisplayed(), true);
//		Assert.assertTrue(proceed_to_buy.isDisplayed());
		

	}

}
