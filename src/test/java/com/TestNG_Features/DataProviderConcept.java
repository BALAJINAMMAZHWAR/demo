package com.TestNG_Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
@Test(dataProvider = "data")
	private void credential(String username, String password) {
		System.out.println("Username is "+username);
		System.out.println("password is "+password);	
	}
	@DataProvider
	private Object[][] data() {
return new Object[][] {

	{"James","James123"},
	{"bala","bala89mechanic"}
	};
}
}
