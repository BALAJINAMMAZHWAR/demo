package com.TestNG_Features;

import org.testng.annotations.Test;

public class ExpectedException {
@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {
	int a=10;
	System.out.println(a/0);
}
	
	
	
	
}
