package com.TestNG_Features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Retry {
	@Test
private void userName() {
String exp="Bala123";
String act="Bala123";
Assert.assertEquals(act, exp);
}
	@Test(retryAnalyzer = Rerun.class)
	private void password() {
String exp="priyabala89";
String act="priyabala143";
Assert.assertEquals(act, exp);

	}	
}
