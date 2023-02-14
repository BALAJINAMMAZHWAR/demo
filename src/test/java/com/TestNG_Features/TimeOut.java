package com.TestNG_Features;

import org.testng.annotations.Test;

public class TimeOut {

	@Test(timeOut = 5000)
	private void setProperty() throws Throwable {
Thread.sleep(2000);
System.out.println("setprop");
Thread.sleep(2000);
System.out.println("crerdentials");
}
@Test(timeOut = 4000)
private void getUrl() throws InterruptedException {
Thread.sleep(3000);
	System.out.println("GetUrl");
}
@Test()
private void refresh() {
System.out.println("Refresh");
}
	
	
	
	
	
	
	
	
	
}
