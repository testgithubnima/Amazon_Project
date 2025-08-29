package com.luv.amazon;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.luv.amazon.HomePage_Search;
import com.luv.amazon.SearchResultPage;

public class _005TestCase_SearchProduct extends BaseClass_Amazon{
	
	@Test
	public void searchProduct() throws InterruptedException {
		
		Loginpage login=new Loginpage(driver);
		login.login();
		login.emailOrPhoneNum();
		login.clickContinue();
		login.password();
		login.clickSignIn();
		
		
		HomePage_Search search=new HomePage_Search(driver);
		search.searchProduct();
		search.productAutosuggestions();
		
		
		String title=driver.getTitle();
		Assert.assertEquals(title.contains("Amazon"),true);
		
		
		}
		
		
		
	}
	
	
	 
