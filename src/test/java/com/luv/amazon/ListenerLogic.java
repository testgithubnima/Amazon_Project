package com.luv.amazon;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerLogic implements ITestListener {

	/*
	 * @Override public void onTestStart(ITestResult result) { // TODO
	 * Auto-generated method stub ITestListener.super.onTestStart(result); }
	 */

	@Override
	public void onTestSuccess(ITestResult result) {

		ITestListener.super.onTestSuccess(result);

		Reporter.log("Testcase Passed");

		screenshot();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Testcase Failed");

		screenshot();
	}

	public void screenshot() {
		TakesScreenshot ts = (TakesScreenshot) com.luv.amazon.BaseClass_Amazon.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Latitude\\GroTechMinds\\" + Math.random() + "Amazon_screensot.png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * @Override public void onTestSkipped(ITestResult result) { // TODO
	 * Auto-generated method stub ITestListener.super.onTestSkipped(result); }
	 */

	/*
	 * @Override public void onTestFailedButWithinSuccessPercentage(ITestResult
	 * result) { // TODO Auto-generated method stub
	 * ITestListener.super.onTestFailedButWithinSuccessPercentage(result); }
	 */

	/*
	 * @Override public void onTestFailedWithTimeout(ITestResult result) { // TODO
	 * Auto-generated method stub
	 * ITestListener.super.onTestFailedWithTimeout(result); }
	 */

	/*
	 * @Override public void onStart(ITestContext context) { // TODO Auto-generated
	 * method stub ITestListener.super.onStart(context); }
	 */

	/*
	 * @Override public void onFinish(ITestContext context) { // TODO Auto-generated
	 * method stub ITestListener.super.onFinish(context); }
	 */

}
