package com.luv.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_RegisterPage {
	
	WebDriver driver;
	public Amazon_RegisterPage(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
	}
		
		  @FindBy (xpath = "//input[@id='ap_email_login']")
		  WebElement enter_email_mob;
		  
		  @FindBy(xpath = "//span[@id='continue']")
		  WebElement click_continue;
		  
		  @FindBy(xpath = "//span[@id='intention-submit-button']")
		  WebElement proceed_create_account;
		  
		  @FindBy(xpath = "//input[@type='tel']")
		  WebElement enter_mob;
		  
		  @FindBy(xpath = "//input[@id='continue']")
		  WebElement verify_mob;
		  
		  @FindBy(xpath = "//i[@class='a-icon a-icon-checkbox']")
		  WebElement click_chk_box;
		  
		  @FindBy(xpath = "//span[@id='auth-create-account-btn']")
		  WebElement click_amazon_acc;
		  
		  @FindBy(xpath = "//input[@type='text']")
		  WebElement enter_otp;
		  
		  @FindBy(xpath = "//span[@id='cvf-submit-otp-button']")
		  WebElement create_amazon_acc;
		  
		  
	}


