package com.luv.amazon;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.luv.amazon.HomePage_Search;
import com.luv.amazon.Loginpage;

@Listeners(ListenerLogic.class)
public class _002TestCaseLoginAmazon extends BaseClass_Amazon {
	
	@Test
	public void loginAmazon() throws InterruptedException {
		
		  Loginpage login=new Loginpage(driver); 
		  login.login();
		  
		  login.emailOrPhoneNum(); 
		  Thread.sleep(2000); 
		  login.clickContinue();
		  login.password(); 
		  login.clickSignIn();
		  
		 
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title.contains("Amazon"), true);
//		Assert.assertEquals(title.contains("Amazon"), "Login Failed:Page title Mismatch");
		
}}