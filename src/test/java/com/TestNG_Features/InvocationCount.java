package com.TestNG_Features;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(priority = 0)
	private void setProperty() {
System.out.println("setprop");
}
@Test(priority = 1)
private void getUrl() {
System.out.println("GetUrl");
}
@Test(priority = 2,invocationCount = 3)
private void refresh() {
System.out.println("Refresh");
}
	
}
