package com.luv.amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerLogic implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {

		int initial_count = 0;
		int retry_count = 1;

		if (initial_count < retry_count) {
			retry_count++;
			return true;
		}

		return false;
	}

}
