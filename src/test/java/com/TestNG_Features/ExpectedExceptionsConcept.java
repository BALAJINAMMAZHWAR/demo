package com.TestNG_Features;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {
	@Test(expectedExceptions = NullPointerException.class)   //Expected exception of type class java.lang.NullPointerException but got java.lang.ArithmeticException
private void demo() {								//Exception.class is the parent of all Exceptions
		int b=20;
System.out.println(b/0);
}
}
