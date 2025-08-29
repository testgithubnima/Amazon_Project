package com.luv.amazon;

import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement login_signin;

	@FindBy(id = "ap_email_login")
	WebElement email;

	@FindBy(className = "a-button-input")
	WebElement click_continuebtn;

	@FindBy(id = "ap_password")
	WebElement passwd;

	@FindBy(id = "signInSubmit")
	WebElement click_signIn;

	public void login() {
		login_signin.click();
	}

	public void emailOrPhoneNum() {

		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("6363427026");
//		email.sendKeys("63452678920");
	}

	public void clickContinue() {
		wait.until(ExpectedConditions.elementToBeClickable(click_continuebtn));
		click_continuebtn.click();
	}

	public void password() {

		wait.until(ExpectedConditions.visibilityOf(passwd));
		passwd.sendKeys("Ammu@111");

//		passwd.sendKeys("vactfgvj");
	}

	public void clickSignIn() {

		wait.until(ExpectedConditions.elementToBeClickable(click_signIn));
		click_signIn.click();
	}

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
