package com.TestNG_Features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer{
int start=0;
int end=2;
	@Override
	public boolean retry(ITestResult result) {
		if (start<end) {
			return true;
			
		}
		return false;
	}

	
}
