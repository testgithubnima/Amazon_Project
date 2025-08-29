package com.luv.amazon;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luv.amazon.CartPage;
import com.luv.amazon.HomePage_Search;
import com.luv.amazon.ProductPage;
import com.luv.amazon.SearchResultPage;

public class _012TestCase_PaymentPage extends BaseClass_Amazon{
	
	
	@Test
	public void paymentPage() throws InterruptedException {
		
		HomePage_Search home=new HomePage_Search(driver);
		home.searchProduct();
		
		SearchResultPage searchResultPage= new SearchResultPage(driver);
		searchResultPage.clickProduct();
		
		ProductPage productPage=new ProductPage(driver);
		productPage.addCart();
		
		CartPage page=new CartPage(driver);
		page.ProceetoBuy();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("checkout"));
	}

}
